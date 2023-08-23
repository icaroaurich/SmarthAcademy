#include "Credentials.h"

#define MYSQL_DEBUG_PORT    Serial
#define _MYSQL_LOGLEVEL_    1

#include <MySQL_Generic.h>

IPAddress server(192, 168, 183, 226); //Trocar pelo IP da máquina PELO IP DA SUA BASE SQL

uint16_t server_port = 4407;

MySQL_Connection conn((Client *)&client);
MySQL_Query *query_mem;

void setup(){
  Serial.begin(115200);
  while (!Serial && millis() < 5000);

  MYSQL_DISPLAY1("\nInicializando ", ARDUINO_BOARD);
  MYSQL_DISPLAY(MYSQL_MARIADB_GENERIC_VERSION);
  MYSQL_DISPLAY1("Conectando a rede: ", ssid);
  
  WiFi.begin(ssid, pass);
  
  while (WiFi.status() != WL_CONNECTED){
    delay(500);
    MYSQL_DISPLAY0(".");
  }

  MYSQL_DISPLAY1("Conectado na rede. Meu endereço de IP é: ", WiFi.localIP());
  MYSQL_DISPLAY3("Tentando conexão em @", server, ", Porta =", server_port);
}

void runInsert(){
  long rand_val = random(0,500);
  
  MySQL_Query query_mem = MySQL_Query(&conn);

  if (conn.connected()){
    // Comando SQL insert teste
    String sql_query = "insert into academy.teste(name,value) values('esp32'," + String(rand_val) + ");";
    MYSQL_DISPLAY(sql_query);

    if (!query_mem.execute(sql_query.c_str())){
      MYSQL_DISPLAY("Erro :(");
    }
    else{
      MYSQL_DISPLAY("Dados inseridos com sucesso.");
    }
  }
  else{
    MYSQL_DISPLAY("Desconectado do servidor. Não foi possível inserir.");
  }
}

void loop(){
  MYSQL_DISPLAY("Conectando...");
  
  if (conn.connectNonBlocking(server, server_port, user, password) != RESULT_FAIL){
    delay(500);
    runInsert();
    conn.close(); 
  } 
  else{
    MYSQL_DISPLAY("\nFalha na conexão. Tentando novamente em 1 minuto.");
  }

  MYSQL_DISPLAY("\nSleep delay...");
  MYSQL_DISPLAY("================================================");
 
  delay(60000);
}