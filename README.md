# SmarthAcademy
Documentação do Back-end
## Visão Geral
Este repositório tem por finalidade armazenar os arquivos utilizados para construção do serviço de tráfego e monitoramento do fluxo dos dados da academia presentes no banco de dados alimentados pelas técnologias ESP-32 e Câmeras de segurança.

## Propósito
O back-end é responsável pelo processamento lógico e gerenciamento de dados, o folder nomeado SmarthAcademy contém os arquivos da modularização Sprnig Boot, serviço que interliga o frontend ao banco de dados.
O folder nomeado ESP contém o datasheet, arquivo de parametrização e script da programação do ESP-32 que captura a presença ou falta da presença utilizando um sensor ultrasônico, inserindo no banco de dados as inforamações capturadas.
O folder nomeado Cameras contém a programação em Python da captura das imagens das câmeras, identificando a presença ou ausência do mesmo e convertendo em dado, alimentando assim o banco de dados.

## Tecnologias Principais

<a href="https://www.w3schools.com/cpp/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/cplusplus/cplusplus-original.svg" alt="cplusplus" width="40" height="40"/> </a>
<a href="https://git-scm.com/"           target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> 
<a href="https://www.java.com"           target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> 
<a href="https://www.mysql.com/"         target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a> 
<a href="https://www.python.org"         target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/python/python-original.svg" alt="python" width="40" height="40"/> </a> 
<a href="https://spring.io/"             target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p>

## Dependências
[Lista de dependências e versões]
Configuração do Ambiente de Desenvolvimento
Instruções detalhadas sobre como configurar o ambiente de desenvolvimento local.

## Pré-requisitos
[Dependências específicas do back-end]

## Instalação
Foi utilizado Spring Tools 4 for Eclipse 4.20.1 for Windows: https://spring.io/tools
- Com o Eclipse instalado e aberto, selecione a opção para importar projeto Maven e aponte para o pom.xml deste projeto.
- Navegue até o arquivo src/main/resources > application.properties e informe altere os dados para conectar com o seu banco de dados

