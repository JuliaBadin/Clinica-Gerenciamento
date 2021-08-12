package poo.clinica;

import java.util.ArrayList;

public class Horario {
    public Double horario;
    public Boolean disponivel;
    public static ArrayList<Horario> listaHorarios = new ArrayList<>();
    
    public static ArrayList<Horario> getListaHorarios() {
        return listaHorarios;
    }
    
    public static void setHorariosPadrao(){
        Horario horarios = new Horario();
        horarios.horario = 08.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 08.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 09.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 09.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 10.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 10.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 11.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 13.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 13.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 14.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 14.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 15.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 15.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 16.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 16.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 17.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 17.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 18.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 18.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 19.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 19.30;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
        horarios.horario = 20.00;
        horarios.disponivel = true;
        listaHorarios.add(horarios);
    }
}
