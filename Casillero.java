package practicaClass;

class paquete{
    String Codigo_rastreo;
    double peso_libras;

    //inicializacion

    paquete(String c, double p){
        Codigo_rastreo = c;
        peso_libras = p;
    }

    double calcularCosto(){
        return peso_libras*4.50;
    }
}

class paqueteFragil extends paquete{
    paqueteFragil(String c, double p){
        super(c, p);
    }

    double costo_burbuja = 5.00;

    double calcularCosto(){
        return peso_libras*4.50 + costo_burbuja;
    }
    
}

class paqueteElectronico extends paquete{
    paqueteElectronico(String c, double p){
        super(c, p);
    }

    boolean tiene_bateria;

    double calcularCosto(){
        if(tiene_bateria){
            return super.calcularCosto()+15.00;
        }else{
            return super.calcularCosto();
        }
    }
}

public class Casillero {
    public static void main(String[] args) {
        //inicializamos cada clase
        paquete paquet = new paquete("1223AD4423HN", 4.45);
        paqueteFragil paquetF = new paqueteFragil("345TUDS34HN", 5.67);
        paqueteElectronico paquetE = new paqueteElectronico("345HN34AD", 2.33);

        //
        paquete fPaquete;

        fPaquete=paquet;
        System.out.println("costo paquete base " + fPaquete.calcularCosto());

        fPaquete=paquetE;
        System.out.println("costo paquete Electronico " + fPaquete.calcularCosto());

        fPaquete=paquetF;
        System.out.println("costo paquete Fragil " + fPaquete.calcularCosto());


    }
    
}
