> Programação Orientada a Objetos > Conteúdo > Java

# Ambiente de Desenvolvimento

Prof. Eduardo Ono

<br>

## Java

### Windows

* Instalação padrão de softwares para Windows.

<br>

### Linux (Ubuntu)

* Atualizar os pacotes do Linux

  ```sh
  sudo apt update && sudo apt upgrade
  ```

* Instalar o Java OpenJDK (LTS):

  ```sh
  sudo apt install default-jdk
  ```

  ou

  ```sh
  sudo apt install java-11-openjdk
  ```

* Para desinstalar alguma versão do Java OpenJDK:

  ```sh
  sudo apt remove openjdk-11-jdk
  ```

* Instalar versões do AdoptOpenJDK:

   ```sh
  wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -
  sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/
  sudo apt update
  sudo apt install adoptopenjdk-8-hotspot  # Java 8 / HotSpot VM
  sudo apt install adoptopenjdk-8-openj9   # Java 8 / OpenJ9 VM
  sudo apt install adoptopenjdk-11-hotspot # Java 11 / HotSpot VM
  sudo apt install adoptopenjdk-11-openj9  # Java 11 / OpenJ9 VM
  ```

  Obs.: Hotspot = Oracle (recomendado); Openj9 = IBM/Eclipse

* Remover versões do AdoptOpenJDK:

  ```sh
  sudo apt-get remove adoptopenjdk --auto-remove
  ```

* Verificar a instalação do Java

  ```sh
  java -version
  javac -version
  ```

* Selecionar a versão corrente do Java, caso existam várias versões do JDK instaladas:

  ```sh
  sudo update-alternatives --config java
  ```

* Listar os paths das versões instaladas do JAVA

  ```sh
  update-alternatives --list java
  ```

* Criar a variável de ambiente `JAVA_HOME` para usuário local, inserindo ao fim do arquivo `~/.bashrc`. Obs.: Será atribuída a primeira versão do Java listada, quando há várias versões instaladas:

  ```sh
  export JAVA_HOME=$(dirname $(dirname $(update-alternatives --list javac 2>&1 | head -n 1)))
  ```

  Obs.: Poderá ser criada como variável de ambiente do sistema inserindo ao final do arquivo `/etc/environment`. Porém, deverá ser digitado o path "literalmente". Ex.:

    ```sh
    /usr/lib/jvm/adoptopenjdk-11-openj9-amd64
    ```

  Para atualizar a inserção:

  ```sh
  source /etc/environment
  ```

<br>
