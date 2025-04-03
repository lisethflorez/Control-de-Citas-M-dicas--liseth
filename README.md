CREATE DATABASE citas_medicas;
USE citas_medicas;
CREATE TABLE pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    email VARCHAR(100) UNIQUE
);
CREATE TABLE especialidades (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE
);
CREATE TABLE medicos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    especialidad_id INT NOT NULL,
    horario_inicio TIME NOT NULL,
    horario_fin TIME NOT NULL,
    FOREIGN KEY (especialidad_id) REFERENCES especialidades(id) ON DELETE CASCADE
);
CREATE TABLE citas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    paciente_id INT NOT NULL,
    medico_id INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    estado ENUM('PROGRAMADA', 'CANCELADA', 'COMPLETADA') DEFAULT 'PROGRAMADA',
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id) ON DELETE CASCADE,
    FOREIGN KEY (medico_id) REFERENCES medicos(id) ON DELETE CASCADE
);
SHOW TABLES;
DESC pacientes;
DESC medicos;
DESC citas;
INSERT INTO especialidades (nombre) VALUES ('Cardiología'), ('Dermatología'), ('Pediatría');

INSERT INTO medicos (nombre, especialidad_id, horario_inicio, horario_fin) 
VALUES ('Dr. Pérez', 1, '08:00:00', '14:00:00'),
       ('Dra. Gómez', 2, '10:00:00', '18:00:00');

INSERT INTO pacientes (nombre, direccion, telefono, email) 
VALUES ('Juan Pérez', 'Calle 123', '3001234567', 'juan@example.com');

INSERT INTO citas (paciente_id, medico_id, fecha, hora, estado) 
VALUES (1, 1, '2025-04-10', '09:00:00', 'PROGRAMADA');
