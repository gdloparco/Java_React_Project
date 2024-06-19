
---

## BACKEND SETUP GUIDE FOR WSL

---

**Run the following commands one at the time in a new terminal within the folder ./backend**

### UPDATE THE LOCAL PACKAGE INDEX

sudo apt update

### INSTALL JAVA

sudo apt install openjdk-11-jdk

**Spring Boot 3.3 requires Java 17 or newer due to compatibility issues with older Java versions. If you haven't already installed Java 17, follow these steps:**

sdk install java 17.0.1-open
sdk use java 17.0.1-open

**Restart Terminal**

### INSTALL MAVEN
sudo apt install maven

### INSTALL SPRING BOOT
sudo apt install unzip
sudo apt install zip
curl -s https://get.sdkman.io | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install springboot

### CHECK INSTALLATION OF JAVA, MAVEN AND SPRING BOOT

java --version
mvn --version
spring --version

**CONGRATS! YOUR BACKEND IS NOW READY TO RUN**

</br>
---

## FRONTEND SETUP GUIDE FOR WSL

---

**Run the following commands one at the time in a new terminal within the folder ./frontend**

### INSTALL NVM (Node Version Manager)

curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.2/install.sh | bash

**Restart Terminal**

### INSTALL LATEST LTS Version of Node.js

nvm install --lts

### CHECK INSTALLATION OF NODE and NPM (Node Package Manager)

node -v
npm -v

**CONGRATS! YOUR FRONTEND IS NOW READY TO RUN**