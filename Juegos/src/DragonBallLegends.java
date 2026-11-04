void main() {

    IO.println(" ----------- BIENVENIDO A LOS PISOS ZENKAI ----------- ");
    IO.println(" ----------- PERSONAJE 1 ----------- ");

    // Iniciamos las variables para el personaje 1
    String nombre_personaje_1 = IO.readln("Cómo se llama tu primer personaje? ");

    int vida_personaje_1;
    do {
        vida_personaje_1 = Integer.parseInt(IO.readln("Introduce la vida de " + nombre_personaje_1 + ": (10-100) "));
        if (vida_personaje_1 < 10 || vida_personaje_1 > 100) {
            IO.println("Vida fuera de rango, repite el dato");
        }
    } while (vida_personaje_1 < 10 || vida_personaje_1 > 100);

    int ataque_personaje_1;
    do {
        ataque_personaje_1 = Integer.parseInt(IO.readln("Cuánto daño hace " + nombre_personaje_1 + "?: (10-50) "));
        if (ataque_personaje_1 < 10 || ataque_personaje_1 > 50) {
            IO.println("Ataque fuera de rango, repite el dato");
        }
    } while (ataque_personaje_1 < 10 || ataque_personaje_1 > 50);

    int ki_personaje_1;
    do {
        ki_personaje_1 = Integer.parseInt(IO.readln("Cuánto ki inicial tiene " + nombre_personaje_1 + "?: (0-100) "));
        if (ki_personaje_1 < 10 || ki_personaje_1 > 100) {
            IO.println("Ki fuera de rango, repite el dato");
        }
    } while (ki_personaje_1 < 0 || ki_personaje_1 > 100);

    String tosudez_1;
    do {
        tosudez_1 = IO.readln(nombre_personaje_1 + " tiene tosudez? (Si/No) ").trim().toLowerCase();
        if (!tosudez_1.equals("si") && !tosudez_1.equals("no")) {
            IO.println("Dato Incorrecto, vuelve a intentarlo");
        }
    } while (!tosudez_1.equals("si") && !tosudez_1.equals("no"));

    String clase_1;
    do {
        clase_1 = IO.readln("Que tipo de clase es tu personaje? (Físico/Energía/Apoyo)").trim().toLowerCase();
        if (!clase_1.equals("fisico") && !clase_1.equals("energia") && !clase_1.equals("apoyo")) {
            IO.println("Esa clase ya está en uso o no existe, vuelve a intentarlo");
        }
    } while (!clase_1.equals("fisico") && !clase_1.equals("energia") && !clase_1.equals("apoyo"));



    // Separamos las preguntas de los personajes
    IO.println("");
    IO.println(" ------------  PERSONAJE 2 ------------ ");



    // Iniciamos las variables para el personaje 2
    String nombre_personaje_2 = IO.readln("Cómo se llama tu primer personaje? ");

    int vida_personaje_2;
    do {
        vida_personaje_2 = Integer.parseInt(IO.readln("Introduce la vida de " + nombre_personaje_2 + ": (10-100) "));
        if (vida_personaje_2 < 10 || vida_personaje_2 > 100) {
            IO.println("Vida fuera de rango, repite el dato");
        }
    } while (vida_personaje_2 < 10 || vida_personaje_2 > 100);

    int ataque_personaje_2;
    do {
        ataque_personaje_2 = Integer.parseInt(IO.readln("Cuánto daño hace " + nombre_personaje_2 + "?: (10-50) "));
        if (ataque_personaje_2 < 10 || ataque_personaje_2 > 50) {
            IO.println("Ataque fuera de rango, repite el dato");
        }
    } while (ataque_personaje_2 < 10 || ataque_personaje_2 > 50);

    int ki_personaje_2;
    do {
        ki_personaje_2 = Integer.parseInt(IO.readln("Cuánto ki inicial tiene " + nombre_personaje_2 + "?: (0-100) "));
        if (ki_personaje_2 < 10 || ki_personaje_2 > 100) {
            IO.println("Ki fuera de rango, repite el dato");
        }
    } while (ki_personaje_2 < 0 || ki_personaje_2 > 100);

    String tosudez_2;
    do {
        tosudez_2 = IO.readln(nombre_personaje_2 + " tiene tosudez? (Si/No) ").trim().toLowerCase();
        if (!tosudez_2.equals("si") && !tosudez_2.equals("no")) {
            IO.println("Dato Incorrecto, vuelve a intentarlo");
        }
    } while (!tosudez_2.equals("si") && !tosudez_2.equals("no"));

    String clase_2;
    do {
        clase_2 = IO.readln("Que tipo de clase es tu personaje? (Físico/Energía/Apoyo)").trim().toLowerCase();
        if (!clase_2.equals("fisico") && !clase_2.equals("energia") && !clase_2.equals("apoyo") || clase_2.equals(clase_1)) {
            IO.println("Esa clase ya está en uso o no existe, vuelve a intentarlo");
        }
    } while (!clase_2.equals("fisico") && !clase_2.equals("energia") && !clase_2.equals("apoyo") || clase_2.equals(clase_1));



    // Separamos las preguntas de los personajes
    IO.println("");
    IO.println(" ------------  PERSONAJE 3 ------------ ");



    // Iniciamos las variables para el personaje 3
    String nombre_personaje_3 = IO.readln("Cómo se llama tu tercer personaje? ");

    int vida_personaje_3;
    do {
        vida_personaje_3 = Integer.parseInt(IO.readln("Introduce la vida de " + nombre_personaje_3 + ": (10-100) "));
        if (vida_personaje_3 < 10 || vida_personaje_3 > 100) {
            IO.println("Vida fuera de rango, repite el dato");
        }
    } while (vida_personaje_3 < 10 || vida_personaje_3 > 100);

    int ataque_personaje_3;
    do {
        ataque_personaje_3 = Integer.parseInt(IO.readln("Cuánto daño hace " + nombre_personaje_3 + "?: (10-50) "));
        if (ataque_personaje_3 < 10 || ataque_personaje_3 > 50) {
            IO.println("Ataque fuera de rango, repite el dato");
        }
    } while (ataque_personaje_3 < 10 || ataque_personaje_3 > 50);

    int ki_personaje_3;
    do {
        ki_personaje_3 = Integer.parseInt(IO.readln("Cuánto ki inicial tiene " + nombre_personaje_3 + "?: (0-100) "));
        if (ki_personaje_3 < 10 || ki_personaje_3 > 100) {
            IO.println("Ki fuera de rango, repite el dato");
        }
    } while (ki_personaje_3 < 0 || ki_personaje_3 > 100);

    String tosudez_3;
    do {
        tosudez_3 = IO.readln(nombre_personaje_3 + " tiene tosudez? (Si/No) ").trim().toLowerCase();
        if (!tosudez_3.equals("si") && !tosudez_3.equals("no")) {
            IO.println("Dato Incorrecto, vuelve a intentarlo");
        }
    } while (!tosudez_3.equals("si") && !tosudez_3.equals("no"));

    String clase_3;
    do {
        clase_3 = IO.readln("Que tipo de clase es tu personaje? (Físico/Energía/Apoyo)").trim().toLowerCase();
        if (!clase_3.equals("fisico") && !clase_3.equals("energia") && !clase_3.equals("apoyo") || clase_3.equals(clase_1) || clase_3.equals(clase_2)) {
            IO.println("Esa clase ya está en uso o no existe, vuelve a intentarlo");
        }
    } while (!clase_3.equals("fisico") && !clase_3.equals("energia") && !clase_3.equals("apoyo") || clase_3.equals(clase_1) || clase_3.equals(clase_2));

    // Separamos el inicio
    IO.println("");
}