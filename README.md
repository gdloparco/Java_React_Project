
---

## BACKEND SETUP GUIDE FOR WSL

---

<code style="color: green">*Run the following commands one at the time in a new terminal within the folder ./backend*</code>

### UPDATE THE LOCAL PACKAGE INDEX

sudo apt update

</br>

### INSTALL JAVA

```sh
sudo apt install openjdk-11-jdk
```

<code style="color: green">*Spring Boot 3.3 requires Java 17 or newer due to compatibility issues with older Java versions. If you haven't already installed Java 17, follow these steps:*</code>

```sh
sdk install java 17.0.1-open
sdk use java 17.0.1-open
```

<code style="color: green">*Restart Terminal*</code>

</br>

### INSTALL MAVEN

```sh
sudo apt install maven
```

</br>

### INSTALL SPRING BOOT

```sh
sudo apt install unzip
sudo apt install zip
curl -s https://get.sdkman.io | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install springboot
```

</br>

### CHECK INSTALLATION OF JAVA, MAVEN AND SPRING BOOT

```sh
java --version
mvn --version
spring --version
```

</br>

**CONGRATS! YOUR BACKEND IS NOW READY TO RUN**

</br>

---

## FRONTEND SETUP GUIDE FOR WSL

---

<code style="color: green">*Run the following commands one at the time in a new terminal within the folder ./frontend*</span>

### INSTALL NVM (Node Version Manager)

```sh
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.2/install.sh | bash
```

**Restart Terminal**

### INSTALL LATEST LTS Version of Node.js

```sh
nvm install --lts
```

### CHECK INSTALLATION OF NODE and NPM (Node Package Manager)

```sh
node -v
npm -v
```

```go
// CONGRATS! YOUR FRONTEND IS NOW READY TO RUN**
```