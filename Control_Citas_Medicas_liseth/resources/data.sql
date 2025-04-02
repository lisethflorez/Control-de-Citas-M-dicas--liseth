
CREATE DATABASE IF NOT EXISTS citas_medicas;
USE citas_medicas;

CREATE TABLE IF NOT EXISTS paciente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(200),
    telefono VARCHAR(20),
    email VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS especialidad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS medico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    especialidad_id INT,
    horario_inicio TIME,
    horario_fin TIME,
    FOREIGN KEY (especialidad_id) REFERENCES especialidad(id)
);

CREATE TABLE IF NOT EXISTS cita (
    id INT AUTO_INCREMENT PRIMARY KEY,
    paciente_id INT,
    medico_id INT,
    fecha_hora DATETIME,
    estado VARCHAR(20),
    FOREIGN KEY (paciente_id) REFERENCES paciente(id),
    FOREIGN KEY (medico_id) REFERENCES medico(id)
);
