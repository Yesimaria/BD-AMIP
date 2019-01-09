package lib;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.toedter.calendar.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Desire
 */
public class OpJCalendar {

    SimpleDateFormat formatF;
    Calendar calendario = Calendar.getInstance();
    JCalendar jc;
    JDateChooser jdc;
    JMonthChooser jmc;
    JYearChooser jyc;
    JDayChooser jdiac;

    public OpJCalendar() {

    }

    //Setts y Getts
    public void setFechaActual(JDateChooser j) {
        j.setDate(calendario.getTime());
    }

    public void setFechaMax(JDateChooser j) {
        j.setMaxSelectableDate(calendario.getTime());
    }

    public JCalendar getJc() {
        return jc;
    }

    public void setJc(JCalendar jc) {
        this.jc = jc;
    }

    public JDateChooser getJdc() {
        return jdc;
    }

    public void setJdc(JDateChooser jdc) {
        this.jdc = jdc;
    }

    public JMonthChooser getJmc() {
        return jmc;
    }

    public void setJmc(JMonthChooser jmc) {
        this.jmc = jmc;
    }

    public JYearChooser getJyc() {
        return jyc;
    }

    public void setJyc(JYearChooser jyc) {
        this.jyc = jyc;
    }

    public JDayChooser getJdiac() {
        return jdiac;
    }

    public void setJdiac(JDayChooser jdiac) {
        this.jdiac = jdiac;
    }

//Metodos sobre cargados.
    //retorna un entero correspondiente al dia del mes desde un JDateChooser ;
    public int ObtDiaMes(JDateChooser dia) {
        int d = dia.getCalendar().get(Calendar.DAY_OF_MONTH);
        return d;
    }

    //retorna un entero correspondiente al dia del mes desde un JCalendar.
    public int ObtDiaMes(JCalendar dia) {
        int d = dia.getCalendar().get(Calendar.DAY_OF_MONTH);
        return d;
    }

    //retorna un entero correspondiente al mes del año desde un JDateChooser.
    public int ObtMes(JDateChooser mes) {
        int m = mes.getCalendar().get(Calendar.MONTH);
        return m;
    }

    //retorna un entero correspondiente al mes del año desde un JCalendar.
    public int ObtMes(JCalendar mes) {
        int m = mes.getCalendar().get(Calendar.MONTH);
        return m;
    }

    //retorna un entero correspondiente año desde un JDateChooser.
    public int ObtYear(JDateChooser año) {
        int a = año.getCalendar().get(Calendar.YEAR);
        return a;
    }
    //retorna un entero correspondiente año desde un JCalendar.

    public int ObtYear(JCalendar año) {
        int a = año.getCalendar().get(Calendar.YEAR);
        return a;
    }

    //retorna un String correspondiente a la fecha, con el formato especificado.
    //Ejemplo de formatos: "dd-MM-yyyy","DDD-MMMM-yyyyy","MMM-yyyy",etc.
    public String ObtFecha(JDateChooser fecha, String format) {
        formatF = new SimpleDateFormat(format);
        String f = formatF.format(fecha.getDate());
        return f;
    }

    public String ObtFecha(JCalendar fecha, String format) {
        formatF = new SimpleDateFormat(format);
        String f = formatF.format(fecha.getDate());
        return f;
    }
}
