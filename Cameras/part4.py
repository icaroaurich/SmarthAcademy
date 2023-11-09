import cv2

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

def Identifica():
    x,y ,largura,altura = 100,100,200,200
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
            cv2.imshow('ao vivo', frame_vivo)
            b1, g1, r1 = frame_vivo[100, 100]
            if b1 == b:
                print('não tem gente')
            else:
                print('tem gente')
                
            print(b, g, r) 
            print(b1, g1, r1) 
            cv2.rectangle(frame, (x, y), (x + largura, y + altura), (0, 255, 0), 2)
            conta_tempo=0
        k = cv2.waitKey(30) & 0xff
        if k == 27:
            break

    
    
    cap.release()
    cv2.destroyAllWindows()
    
    

# Grava o vídeo
#gravaVideo()

# Agora tenta identificar
Identifica()
