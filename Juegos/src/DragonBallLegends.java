void main() {

    IO.println(" ----------- BIENVENIDO A LOS PISOS ZENKAI ----------- ");
    final int DESCANSO_LECTURA = 10000;
    int turno;
    int personaje_usable = 0;
    // Cooldown para el personaje 1
    int cooldown_1_fisica;
    int cooldown_1_energia;
    int cooldown_1_tecnica;
    int cooldown_1_habilidad;
    int cooldown_2_fisica;
    // Cooldown para el personaje 2
    int cooldown_2_energia;
    int cooldown_2_tecnica;
    int cooldown_2_habilidad;
    // Cooldown para el personaje 3
    int cooldown_3_fisica;
    int cooldown_3_energia;
    int cooldown_3_tecnica;
    int cooldown_3_habilidad;
    //Cooldown para la curacion
    int cooldown_curacion;


    // Damos las instrucciones de como funciona el juego al usuario
    IO.println("Bienvenido a los pisos Zenkai. Este juego consta en una serie de combates contra personajes (que están nombrados por defecto) de la serie Dragon Ball");
    IO.println("Te pediré lo siguiente para jugar: los nombres para tus 3 guerreros, su vida máxima, su ataque normal, su ki inicial, si tiene tosudez o no, su clase y lo más importante, ganas de jugar ;)");
    IO.println("Tu misión es ganarle al último jefe, y te seré sincero, haré que sea muy complicado ganarle. Tus acciones serán las siguientes: Atacar, energía, esquivar, recargar ki. No hay defensa");

    IO.println("");
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
        if (ki_personaje_1 < 0 || ki_personaje_1 > 100) {
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
        if (ki_personaje_2 < 0 || ki_personaje_2 > 100) {
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
        if (ki_personaje_3 < 0 || ki_personaje_3 > 100) {
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

    //Presentamos los costes de cada acción dependiendo de su clase
    IO.println("Gasto de ki para el personaje de clase 'físico': 10 de ki por ataque físico, 15 de ki por ataque de ki, 45 de ki por técnica especial y se recupera 60 de ki por habilidad especial");
    IO.println("Gasto de ki para el personaje de clase 'energía': 15 de ki por ataque físico, 10 de ki por ataque de ki, 50 de ki por técnica especial y se recupera 60 de ki por habilidad especial");
    IO.println("Gasto de ki para el personaje de clase 'apoyo': 15 de ki por ataque físico, 15 de ki por ataque de ki, 50 de ki por técnica especial, 20 de ki por curación hasta un 75% de vida y se recupera 60 de ki por habilidad especial");

    // Presentamos el primer enemigo
    IO.println("------------  ENEMIGO 1 ------------ ");
    String freezer = "Freezer Forma Final";
    double freezer_vida = 200;
    int freezer_ataque = 5;
    int freezer_ki = 50;
    int cooldown_freezer;
    IO.println("Tu primer enemigo es: " + freezer);

    // Esto es el bucle de la partida
    while (!(freezer_vida <= 0) || !(vida_personaje_1 <= 0) && !(vida_personaje_2 <= 0) && !(vida_personaje_3 <= 0)) {

        // Preguntamos al usuario a que personaje quiere usar
        if (vida_personaje_1 >= 0 && vida_personaje_2 >= 0 && vida_personaje_3 >= 0){
            do {
                personaje_usable = Integer.parseInt(IO.readln("Qué personaje quieres usar (En número)? (1." + nombre_personaje_1 + " /2." + nombre_personaje_2 + " /3."+ nombre_personaje_3 + ")"));
            } while (personaje_usable != 1 && personaje_usable != 2 && personaje_usable != 3);
        } else if (vida_personaje_1 <= 0){
            do {
                personaje_usable = Integer.parseInt(IO.readln("Qué personaje quieres usar (En número)? (2." + nombre_personaje_2 + " /3."+ nombre_personaje_3 + ")"));
            } while (personaje_usable != 2 && personaje_usable != 3);
        } else if (vida_personaje_2 <= 0){
            do {
                personaje_usable = Integer.parseInt(IO.readln("Qué personaje quieres usar (En número)? (1." + nombre_personaje_1 + " /3."+ nombre_personaje_3 + ")"));
            } while (personaje_usable != 1 && personaje_usable != 3);
        } else if (vida_personaje_3 <= 0){
            do {
                personaje_usable = Integer.parseInt(IO.readln("Qué personaje quieres usar (En número)? (1." + nombre_personaje_1 + " /2." + nombre_personaje_2 + ")"));
            } while (personaje_usable != 1 && personaje_usable != 2);
        }

        IO.println("La vida de " + nombre_personaje_1 + ": " + vida_personaje_1);
        IO.println("El ki de " + nombre_personaje_1 + ": " + ki_personaje_1);
        IO.println("La vida de " + nombre_personaje_2 + ": " + vida_personaje_2);
        IO.println("El ki de " + nombre_personaje_2 + ": " + ki_personaje_2);
        IO.println("La vida de " + nombre_personaje_3 + ": " + vida_personaje_3);
        IO.println("El ki de " + nombre_personaje_3 + ": " + ki_personaje_3);
        IO.println("Personaje elegido: " + personaje_usable);
        IO.println("La vida de Freezer: " + freezer_vida);

        String decision;
        do {
            decision = IO.readln("Qué decisión quieres tomar? (ataque fisico/ ataque de ki/ tecnica especial/ habilidad especial/curacion)").trim().toLowerCase();
        } while (!decision.equals("ataque fisico") && !decision.equals("ataque de ki") && !decision.equals("tecnica especial") && !decision.equals("habilidad especial") && !decision.equals("curacion"));

        if (personaje_usable == 1) {
            if (clase_1.equals("fisico")) {
                if (decision.equals("ataque fisico") && ki_personaje_1 >= 10) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 1.2;
                    ki_personaje_1 = ki_personaje_1 - 10;
                    cooldown_1_fisica = 1;
                } else if (decision.equals("ataque de ki") && ki_personaje_1 >= 15) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 0.8;
                    ki_personaje_1 = ki_personaje_1 - 15;
                    cooldown_1_energia = 1;
                } else if (decision.equals("tecnica especial") && ki_personaje_1 >= 45) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 2;
                    ki_personaje_1 = ki_personaje_1 - 45;
                    cooldown_1_tecnica = 4;
                } else if (decision.equals("habilidad especial")) {
                    ki_personaje_1 = ki_personaje_1 + 60;
                } else if (decision.equals("curacion")) {
                    IO.println(nombre_personaje_1 + " no es de apoyo, se consumirá turno");
                } else if (ki_personaje_1 <= 10) {
                    IO.println(nombre_personaje_1 + " no tiene ki, se consumió turno");
                }

            } else if (clase_1.equals("energia")) {
                if (decision.equals("ataque fisico") && ki_personaje_1 >= 15) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 0.8;
                    ki_personaje_1 = ki_personaje_1 - 15;
                    cooldown_1_fisica = 1;
                } else if (decision.equals("ataque de ki") && ki_personaje_1 >= 10) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 1.2;
                    ki_personaje_1 = ki_personaje_1 - 10;
                    cooldown_1_energia = 1;
                } else if (decision.equals("tecnica especial") && ki_personaje_1 >= 50) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 2;
                    ki_personaje_1 = ki_personaje_1 - 50;
                    cooldown_1_tecnica = 4;
                } else if (decision.equals("habilidad especial")) {
                    ki_personaje_1 = ki_personaje_1 + 60;
                } else if (decision.equals("curacion")) {
                    IO.println(nombre_personaje_1 + " no es de apoyo, se consumirá turno");
                } else if (ki_personaje_1 <= 10) {
                    IO.println(nombre_personaje_1 + " no tiene ki, se consumió turno");
                }

            }else if (clase_1.equals("apoyo")) {
                if (decision.equals("ataque fisico") && ki_personaje_1 >= 15) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 0.8;
                    ki_personaje_1 = ki_personaje_1 - 15;
                    cooldown_1_fisica = 1;
                } else if (decision.equals("ataque de ki") && ki_personaje_1 >= 15) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 0.8;
                    ki_personaje_1 = ki_personaje_1 - 15;
                    cooldown_1_energia = 1;
                } else if (decision.equals("tecnica especial") && ki_personaje_1 >= 50) {
                    freezer_vida = freezer_vida - ataque_personaje_1 * 2;
                    ki_personaje_1 = ki_personaje_1 - 50;
                    cooldown_1_tecnica = 4;
                } else if (decision.equals("habilidad especial")) {
                    ki_personaje_1 = ki_personaje_1 + 60;
                } else if (decision.equals("curacion")) {
                    ki_personaje_1 =  ki_personaje_1 - 20;
                } else if (ki_personaje_1 <= 10) {
                    IO.println(nombre_personaje_1 + " no tiene ki, se consumió turno");
                }
            }
        }
    }
}