/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prectica01.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.Multipart

File;

@Service
public interface FirebaseStorageService {

    public String cargaImagen (MultipartFile archivoLocalCliente, String carpeta, Long id);
    //E1 BuketName es el <id_del_proyecto> + .appspot.com/
    final String BucketName = "practica1-96a3e.appspot.com";
    //Esta es la ruta básica de este proyecto 
    final String rutaSuperiorStorage = "practica1";
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile "firebase";
    //El nombre del archivo Json
    final String archivoJsonFile = "path/to/serviceAccountKey.json";
