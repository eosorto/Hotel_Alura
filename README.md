# Challenge ONE | Java | Back-end | Hotel Alura

<p align="center" >
     <img width="300" heigth="300" src="https://user-images.githubusercontent.com/91544872/189419040-c093db78-c970-4960-8aca-ffcc11f7ffaf.png">
</p>

---
##  Primeros Pasos:


#### 🔹 visita Youtube para ver proyecto terminado ⭐
#### 🔹 [Video Finalizado Youtube](https://youtu.be/CvOa_DSxDAA). 📚

</br>

## 🖥️ Tecnologías Utilizadas:

- Java
- Eclipse
- Biblioteca JCalendar
- MySql
- Plugin WindowBuilder </br>

---
## ⚠️ Importante! ⚠️

🔹 Imagenes
## 📝 Eclipse

![num1_REC](https://github.com/eosorto/Hotel_Alura/assets/104921951/fa07f4a0-8be8-47f7-8266-081227adc162)

## Database mysql

CREATE DATABASE IF NOT EXISTS hotel_alura;</br>

CREATE TABLE IF NOT EXISTS reservas (</br>
id INT (10)NOT NULL AUTO_INCREMENT, </br>
fecha_entrada DATE NOT NULL,</br>
fecha_salida DATE NOT NULL,</br>
valor double NOT NULL,</br>
forma_pago VARCHAR(35) NOT NULL,</br>
PRIMARY KEY (id)</br>
)ENGINE=InnoDB;</br>

CREATE TABLE IF NOT EXISTS huespedes (</br>
id INT (10) NOT NULL AUTO_INCREMENT, </br>
id_reserva INT(10) NOT NULL,</br>
nombre VARCHAR(50) NOT NULL,</br>
apellido VARCHAR(50) NOT NULL,</br>
fecha_nacimiento DATE NOT NULL,</br>
nacionalidad VARCHAR(50) NOT NULL,</br>
telefono VARCHAR(35) NOT NULL,</br>
PRIMARY KEY (id),</br>
FOREIGN KEY (id_reserva) REFERENCES reservas(id)</br>
)ENGINE=InnoDB;</br>
</br>

### ⚠️ 


<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169529338-09a4d4c2-1b5a-41dc-b305-38498ebc29a8.png">
</p>



🧡 <strong>Oracle</strong></br>
<a href="https://www.linkedin.com/company/oracle/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

💙 <strong>Alura Latam</strong></br>
<a href="https://www.linkedin.com/company/alura-latam/mycompany/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
