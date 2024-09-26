import java.util.Scanner;

class Perguntas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("*   FACULDADE ALFREDO NASSER   *");
        System.out.println("*   Aluno: Gilmar Coelho de Andrade Neto  *");
        System.out.println("*  Professor: Brenno Pimenta da Costa  *");
        System.out.println("*   Quiz de 15 Perguntas sobre Naruto   *");
        System.out.println("*   Olá, bem-vindo ao Quiz de Conhecimentos Gerais!  *");


        System.out.println("Pergunta 1: Qual animal é considerado o rei da selva?");
        System.out.println("a) Leão");
        System.out.println("b) Baleia");
        System.out.println("c) Rato");
        System.out.println("d) Golfinho");
        System.out.println("e) Tartaruga");
        System.out.print("Sua resposta: ");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("a")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é a) Leão.");
        }


        System.out.println("Pergunta 2: Qual é o maior mamífero?");
        System.out.println("a) Anta");
        System.out.println("b) Capivara");
        System.out.println("c) Gorila");
        System.out.println("d) Baleia Azul");
        System.out.println("e) Elefante");
        System.out.print("Sua resposta: ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("d")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é d) Baleia Azul.");
        }


        System.out.println("Pergunta 3: Quantos minutos tem 24 horas?");
        System.out.println("a) 1140");
        System.out.println("b) 1240");
        System.out.println("c) 1340");
        System.out.println("d) 1440");
        System.out.println("e) 1640");
        System.out.print("Sua resposta: ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("d")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é d) 1440.");
        }


        System.out.println("Pergunta 4: Qual é a capital de Goiás?");
        System.out.println("a) Goianésia");
        System.out.println("b) Barro Alto");
        System.out.println("c) Aparecida de Goiânia");
        System.out.println("d) Goiânia");
        System.out.println("e) Goiás Velho");
        System.out.print("Sua resposta: ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("d")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é d) Goiânia.");
        }


        System.out.println("Pergunta 5: Quem foi o primeiro a pisar na lua?");
        System.out.println("a) Neil Armstrong");
        System.out.println("b) Liam Smith");
        System.out.println("c) Oliver Johnson");
        System.out.println("d) Theodore Brown");
        System.out.println("e) Henry Miller");
        System.out.print("Sua resposta: ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("a")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é a) Neil Armstrong.");
        }

        System.out.println("Pergunta 6: Qual inseto mais poliniza as flores?");
        System.out.println("a) Mosca");
        System.out.println("b) Abelha");
        System.out.println("c) Formigas");
        System.out.println("d) Vespas");
        System.out.println("e) Mariposas");
        System.out.print("Sua resposta: ");
        String resposta6 = scanner.nextLine();
        if (resposta6.equalsIgnoreCase("b")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é b) Abelha.");
        }

        System.out.println("Pergunta 7: Qual o minério mais raro do mundo?");
        System.out.println("a) Bauxita");
        System.out.println("b) Ouro");
        System.out.println("c) Kyawthuite");
        System.out.println("d) Urânio");
        System.out.println("e) Prata");
        System.out.print("Sua resposta: ");
        String resposta7 = scanner.nextLine();
        if (resposta7.equalsIgnoreCase("c")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é c) Kyawthuite.");
        }

        System.out.println("Pergunta 8: Quem inventou a lente de óculos?");
        System.out.println("a) Riccardo Romano");
        System.out.println("b) Matteo Greco");
        System.out.println("c) Salvino D'Armate");
        System.out.println("d) Alessandro Ricci");
        System.out.println("e) Nicolo Ferrari");
        System.out.print("Sua resposta: ");
        String resposta8 = scanner.nextLine();
        if (resposta8.equalsIgnoreCase("c")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é c) Salvino D'Armate.");
        }

        System.out.println("Pergunta 9: Quem fez o primeiro motor a diesel?");
        System.out.println("a) Rudolf Diesel");
        System.out.println("b) Durand Martin");
        System.out.println("c) Garcia Bernard");
        System.out.println("d) Richard Thomas");
        System.out.println("e) Bernard Richard");
        System.out.print("Sua resposta: ");
        String resposta9 = scanner.nextLine();
        if (resposta9.equalsIgnoreCase("a")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é a) Rudolf Diesel.");
        }

        System.out.println("Pergunta 10: Quantos continentes existem na Terra?");
        System.out.println("a) 8");
        System.out.println("b) 7");
        System.out.println("c) 5");
        System.out.println("d) 6");
        System.out.println("e) 9");
        System.out.print("Sua resposta: ");
        String resposta10 = scanner.nextLine();
        if (resposta10.equalsIgnoreCase("b")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é b) 7.");
        }

        System.out.println("Pergunta 11: Quantos anos tem um século?");
        System.out.println("a) 1000");
        System.out.println("b) 100");
        System.out.println("c) 10");
        System.out.println("d) 200");
        System.out.println("e) 10000");
        System.out.print("Sua resposta: ");
        String resposta11 = scanner.nextLine();
        if (resposta11.equalsIgnoreCase("b")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é b) 100.");
        }

        System.out.println("Pergunta 12: Quantas cordas tem um violão tradicional?");
        System.out.println("a) 4");
        System.out.println("b) 5");
        System.out.println("c) 7");
        System.out.println("d) 6");
        System.out.println("e) 9");
        System.out.print("Sua resposta: ");
        String resposta12 = scanner.nextLine();
        if (resposta12.equalsIgnoreCase("d")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é d) 6.");
        }

        System.out.println("Pergunta 13: Quantos lados tem um triângulo?");
        System.out.println("a) 6");
        System.out.println("b) 7");
        System.out.println("c) 3");
        System.out.println("d) 4");
        System.out.println("e) 2");
        System.out.print("Sua resposta: ");
        String resposta13 = scanner.nextLine();
        if (resposta13.equalsIgnoreCase("c")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é c) 3.");
        }

        System.out.println("Pergunta 14: O que é o DNA?");
        System.out.println("a) Ácido ribonucleico");
        System.out.println("b) Ácido desoxirribonucleico");
        System.out.println("c) Dextro nucleico");
        System.out.println("d) Ácido nuclear de ribose");
        System.out.println("e) Ácido de nucleotídeos");
        System.out.print("Sua resposta: ");
        String resposta14 = scanner.nextLine();
        if (resposta14.equalsIgnoreCase("b")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é b) Ácido desoxirribonucleico.");
        }

        System.out.println("Pergunta 15: Quem pintou a Mona Lisa?");
        System.out.println("a) Michelangelo");
        System.out.println("b) Rafael");
        System.out.println("c) Leonardo da Vinci");
        System.out.println("d) Donatello");
        System.out.println("e) Van Gogh");
        System.out.print("Sua resposta: ");
        String resposta15 = scanner.nextLine();
        if (resposta15.equalsIgnoreCase("c")) {
            score++;
            System.out.println("Parabéns! Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! A opção correta é c) Leonardo da Vinci.");
        }

        System.out.println("******");
        System.out.println("*   RESULTADO FINAL   *");
        System.out.println("******");
        System.out.println("Você acertou " + score + " perguntas.");
    }
}
