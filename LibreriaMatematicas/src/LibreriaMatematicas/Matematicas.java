package LibreriaMatematicas;

public class Matematicas {

    public static double raizCuadrada(double numero) {
        double comodin;
        double resultado = numero / 2;
        do {
            comodin = resultado;
            resultado = (comodin + (numero / comodin)) / 2;
        } while ((comodin - resultado != 0));
        return resultado;
    }

    public static double factorial(int numero) {
        int resultado = 1;
        if (numero == 0) {
            return resultado;
        } else {
            for (int i = 2; i <= numero; i++) {
                resultado = resultado * i;
            }
        }
        return resultado;
    }

    public static int exponente(int numero, int exponente) {
        int resultado;
        resultado = numero;
        for (int i = 0; i <= exponente; i++) {
            resultado = resultado * numero;
        }
        return resultado;
    }

    public static double valorAbsoluto(double numero) {
        double resultado = numero;
        if (numero < 0) {
            resultado = resultado * (-1);
        }
        return resultado;
    }

    public static double teoremaPitagorasHipotenusa(double ladoA, double ladoB) {
        double resultado;
        resultado = raizCuadrada(((ladoA * ladoA) + (ladoB * ladoB)));
        return resultado;
    }

    public static double teoremaPitagorasLado(double hipotenusa, double ladoAB) {
        double resultado;
        resultado = raizCuadrada(((hipotenusa * hipotenusa) - (ladoAB * ladoAB)));
        return resultado;
    }

    public static double seno(double catetoOpuesto, double hipotenusa) {
        double resultado;
        resultado = catetoOpuesto / hipotenusa;
        return resultado;
    }

    public static double coseno(double catetoAdyacente, double hipotenusa) {
        double resultado;
        resultado = catetoAdyacente / hipotenusa;
        return resultado;
    }

    public static double tangente(double catetoOpuesto, double catetoAdyacente) {
        double resultado;
        resultado = catetoOpuesto / catetoAdyacente;
        return resultado;
    }

    public static double cosecante(double catetoOpuesto, double hipotenusa) {
        double resultado;
        resultado = hipotenusa / catetoOpuesto;
        return resultado;
    }

    public static double secante(double catetoAdyacente, double hipotenusa) {
        double resultado;
        resultado = hipotenusa / catetoAdyacente;
        return resultado;
    }

    public static double cotangente(double catetoOpuesto, double catetoAdyacente) {
        double resultado;
        resultado = catetoAdyacente / catetoOpuesto;
        return resultado;
    }

    public static double angulosARadianes(double angulo) {
        double Pi = 3.1416;
        double resultado;
        resultado = (angulo * Pi) / 180;
        return resultado;
    }

    public static double potencia(double base, int exponente) {
        double resultado;
        if (exponente == 0 || base == 1) {
            resultado = 1;
            return resultado;
        } else if (base == -1) {
            resultado = 1 - (exponente % 2) * 2;
            return resultado;
        } else {
            resultado = base;
            while (exponente-- > 1) {
                resultado *= base;
            }
            return resultado;
        }
    }

    public static double senoAngulo(double angulo) {
        double EPSILON           = 0.00001;
        double resultado         = 0;
        double resultadoAnterior = 0;
        int    sumador           = 0;
        do {
            resultadoAnterior = resultado;
            resultado += potencia(-1, sumador) * potencia(angulo, 2 * sumador + 1) / factorial(2 * sumador + 1);
            sumador++;
        } while (valorAbsoluto(resultado - resultadoAnterior) >= EPSILON);
        return resultado;
    }

    public static double cosenoAngulo(double angulo) {
        double EPSILON           = 0.00001;
        double resultado         = 0;
        double resultadoAnterior = 0;
        int    sumador           = 0;
        do {
            resultadoAnterior = resultado;
            resultado += potencia(-1, sumador) * potencia(angulo, 2 * sumador) / factorial(2 * sumador);
            sumador++;
        } while (valorAbsoluto(resultado - resultadoAnterior) >= EPSILON);
        return resultado;
    }

    public static double tangenteAngulo(double angulo) {
        double resultado;
        resultado = senoAngulo(angulo) / cosenoAngulo(angulo);
        return resultado;
    }
}
