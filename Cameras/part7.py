import mysql.connector
from mysql.connector import Error
import cv2
import time
from datetime import datetime

def conectar(host_name, user_name, user_password, porta, valor, hora):
    connection = None
    try:
        connection = mysql.connector.connect(
            host=host_name,
            user=user_name,
            passwd=user_password,
            port = porta
        )
        print("MySQL Database connection successful")
        teste = (f"insert into smarthacademy.equipamento_fluxo (equipamentoid,horario,presenca) values(2,'{hora}',{valor});")
        query = connection.cursor()
        query.execute(teste)
        connection.commit()
        connection.close()

    except Error as err:
        print(f"foi não: '{err}'")

    return connection

def gravaVideo():
    Capture = cv2.VideoCapture(0)
    fourcc = cv2.VideoWriter_fourcc(*'XVID')
    saida = cv2.VideoWriter('este.avi', fourcc, 10.0, (640, 480))
    captura_frame = 6
    conta_tempo = 0

    while True:
        ret, frame = Capture.read()
        saida.write(frame)
        conta_tempo += 1

        if conta_tempo == captura_frame:
            cv2.imshow('Video', frame)
            conta_tempo = 0
        k = cv2.waitKey(30) & 0xff
        if k == 27:
            break

    Capture.release()
    saida.release()
    cv2.destroyAllWindows()

def tolerancia(a,a1, b,b1, c,c1):
    
    print(a,a1)
    tole_a = int(a) - int(a1)
    tole_b = int(b) - int(b1)
    tole_c = int(c) - int(c1)
    valor = 0
    print(tole_a, tole_b, tole_c)
    if tole_a > -20 and tole_a < 20 :
        if tole_b > -20 and tole_b < 20:            
            if tole_c > -20 and tole_c < 20:
                print('a den')
                valor = 0
    else:
        print('fora')
        valor = 1
    return valor


def Identifica():
    x,y ,largura,altura = 100,100,20,20
    captura_frame = 6
    conta_tempo = 0
    cap = cv2.VideoCapture(r'C:\Users\allan\DEV\PIcerto\este.avi')  
    Capture = cv2.VideoCapture(0)
    fourcc = cv2.VideoWriter_fourcc(*'XVID')
    while True:
        ret, frame = cap.read()

        if not ret:
            cap.set(cv2.CAP_PROP_POS_FRAMES,0)
            continue

        cv2.imshow('Video gravado', frame)
        b, g, r = frame[x, y]
 
        
        
        ret_Vivo, frame_vivo = Capture.read()
        
        conta_tempo+=1
        
        if conta_tempo == captura_frame:
            cv2.rectangle(frame_vivo, (x - 10, y - 10), (x + largura + 50, y + altura + 50), (0, 255, 0), 2)
            cv2.imshow('ao vivo', frame_vivo)
            b1, g1, r1 = frame_vivo[100, 100]
            print('B',b, b1)
            valor = tolerancia(b,b1, g,g1, r,r1)
    
            conta_tempo=0
            hora = datetime.now()
            hora = hora.replace(microsecond=0)
            
            conectar("icaroaurich.dyndns.org", "academy", 'academy', 4407, valor, str(hora))
            time.sleep(3)
        k = cv2.waitKey(30) & 0xff
        if k == 27:
            break
    
    cap.release()
    cv2.destroyAllWindows()

gravaVideo()
Identifica()