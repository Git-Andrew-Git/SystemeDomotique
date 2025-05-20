package fr.andrew;

import fr.andrew.model.observers.AppelDirectSecours;
import fr.andrew.model.observers.DeclenchementAlarme;
import fr.andrew.model.observers.EmailAlert;
import fr.andrew.model.observers.SmartphoneAlert;
import fr.andrew.model.publishers.NO2Sensor;
import fr.andrew.model.publishers.SmokeSensor;
import fr.andrew.model.publishers.TemperatureSensor;

public class Main {
    public static void main(String[] args) {
        SmokeSensor smokeSensor1 = new SmokeSensor(1);
        SmokeSensor smokeSensor2 = new SmokeSensor(2);
        SmokeSensor smokeSensor3 = new SmokeSensor(3);
        SmokeSensor smokeSensor4 = new SmokeSensor(4);

        TemperatureSensor temperatureSensor1 = new TemperatureSensor(1);
        TemperatureSensor temperatureSensor2 = new TemperatureSensor(2);
        TemperatureSensor temperatureSensor3 = new TemperatureSensor(3);
        TemperatureSensor temperatureSensor4 = new TemperatureSensor(4);
        TemperatureSensor temperatureSensor5 = new TemperatureSensor(5);

        NO2Sensor no2Sensor1 = new NO2Sensor(1);
        NO2Sensor no2Sensor2 = new NO2Sensor(2);
        NO2Sensor no2Sensor3 = new NO2Sensor(3);
        NO2Sensor no2Sensor4 = new NO2Sensor(4);

        EmailAlert emailAlert1 = new EmailAlert(1);
        EmailAlert emailAlert2 = new EmailAlert(2);
        EmailAlert emailAlert3 = new EmailAlert(3);

        SmartphoneAlert smartphoneAlert1 = new SmartphoneAlert(1);
        SmartphoneAlert smartphoneAlert2 = new SmartphoneAlert(2);
        SmartphoneAlert smartphoneAlert3 = new SmartphoneAlert(3);


        AppelDirectSecours appelDirectSecours1 = new AppelDirectSecours(1);
        AppelDirectSecours appelDirectSecours2 = new AppelDirectSecours(2);
        AppelDirectSecours appelDirectSecours3 = new AppelDirectSecours(3);


        DeclenchementAlarme declenchementAlarme1 = new DeclenchementAlarme(1);
        DeclenchementAlarme declenchementAlarme2 = new DeclenchementAlarme(2);
        DeclenchementAlarme declenchementAlarme3 = new DeclenchementAlarme(3);

        smokeSensor1.subscribe(appelDirectSecours3);
        smokeSensor1.subscribe(smartphoneAlert2);
        smokeSensor1.subscribe(declenchementAlarme1);
        smokeSensor1.subscribe(declenchementAlarme2);
        smokeSensor1.subscribe(declenchementAlarme3);

        smokeSensor1.simulateDetectionEvent();
        smokeSensor2.simulateDetectionEvent();
    }
}