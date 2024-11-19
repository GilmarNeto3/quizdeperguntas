import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        new Scanner(System.in);
        String resp;
        int cont =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*   FACULDADE ALFREDO NASSER   *");
        System.out.println("*   Aluno: Gilmar Coelho de Andrade Neto  *");
        System.out.println("*  Professor: Brenno Pimenta da Costa  *");
        System.out.println("*   Quiz de 15 Perguntas sobre Naruto   *");
        System.out.println("*   Olá, bem-vindo ao Quiz de Conhecimentos Gerais!  *");

        Questao q1= new Questao();
        q1.pergunta = "Pergunta 1: Qual animal é considerado o rei da selva?";
        q1.opcaoA= "a) Leão";
        q1.opcaoB= "b) Baleia";
        q1.opcaoC= "c) Rato";
        q1.opcaoD= "d) Golfinho";
        q1.opcaoE= "e) Tartaruga";
        q1.correta= "a";
        q1.curiosidade ="Curiosidade: O título de ‘leão, o rei da selva’ não passa de uma antiga metáfora que se mantém até os dias atuais. A ideia surgiu na Grécia Antiga, 6 a.C. Os gregos colocavam os leões como representação de nobreza e bravura.";

        q1.escrevaQuestao();
        resp = q1.leiaResposta();
        if(q1.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q1.curiosidade);
        System.out.println("-----------------");



        Questao q2= new Questao();
        q2.pergunta = "Pergunta 2: Qual é o maior mamífero?";
        q2.opcaoA= "a) Anta";
        q2.opcaoB= "b) Capivara";
        q2.opcaoC= "c) Gorila";
        q2.opcaoD= "d) Baleia Azul";
        q2.opcaoE= "e) Elefante";
        q2.correta= "d";
        q2.curiosidade ="Ela é o maior animal do mundo e pode viver até 90 anos, sendo considerada a avó dos mares.";

        q2.escrevaQuestao();
        resp = q2.leiaResposta();
        if(q2.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q2.curiosidade);
        System.out.println("-----------------");



        Questao q3= new Questao();
        q3.pergunta = "Pergunta 3: Quantos minutos tem 24 horas?";
        q3.opcaoA= "a) 1440";
        q3.opcaoB= "b) 1240";
        q3.opcaoC= "c) 1340";
        q3.opcaoD= "d) 1140";
        q3.opcaoE= "e) 1540";
        q3.correta= "a";
        q3.curiosidade ="A hora foi inventada pelos babilônios e egípcios, que foram os primeiros a marcar a passagem do tempo";

        q3.escrevaQuestao();
        resp = q3.leiaResposta();
        if(q3.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q3.curiosidade);
        System.out.println("-----------------");


        Questao q4= new Questao();
        q4.pergunta = "Pergunta 4: Qual é a capital de Goiás?";
        q4.opcaoA= "a) Goianésia";
        q4.opcaoB= "b) Barro Alto";
        q4.opcaoC= "c) Aparecida de Goiânia";
        q4.opcaoD= "d) Goiânia";
        q4.opcaoE= "e) Goiás Velho";
        q4.correta= "d";
        q4.curiosidade ="Goiânia foi planejada para ser uma capital de 50 mil habitantes, mas hoje já tem mais de um milhão.";

        q4.escrevaQuestao();
        resp = q4.leiaResposta();
        if(q4.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q4.curiosidade);
        System.out.println("-----------------");


        Questao q5= new Questao();
        q5.pergunta = "Pergunta 5: Quem foi o primeiro a pisar na lua?";
        q5.opcaoA= "a) Neil Armstrong";
        q5.opcaoB= "b) Liam Smith";
        q5.opcaoC= "c) Oliver Johnson";
        q5.opcaoD= "d) Theodore Brown";
        q5.opcaoE= "e)  Henry Miller";
        q5.correta= "a";
        q5.curiosidade ="O primeiro passo na Lua foi dado com um pé tamanho 41. Este era o número da bota azul do astronauta Neil Armstrong";

        q5.escrevaQuestao();
        resp = q5.leiaResposta();
        if(q5.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q5.curiosidade);
        System.out.println("-----------------");


        Questao q6= new Questao();
        q6.pergunta = "Pergunta 6: Qual inseto mais poliniza as flores? ";
        q6.opcaoA= "a) Mosca";
        q6.opcaoB= "b) Abelha";
        q6.opcaoC= "c) Formigas";
        q6.opcaoD= "d) Vespas";
        q6.opcaoE= "e) Mariposas";
        q6.correta= "b";
        q6.curiosidade ="Uma abelha melífera visita cerca de 7 mil flores por dia, mas são necessárias quatro milhões de visitas para produzir um quilo de mel";

        q6.escrevaQuestao();
        resp = q6.leiaResposta();
        if(q6.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q6.curiosidade);
        System.out.println("-----------------");


        Questao q7= new Questao();
        q7.pergunta = "Pergunta 7: Qual o minério mais raro do mundo?";
        q7.opcaoA= "a) Bauxita";
        q7.opcaoB= "b) Ouro";
        q7.opcaoC= "c) Kyawthuite";
        q7.opcaoD= "d) Urânio";
        q7.opcaoE= "e) Prata";
        q7.correta= "c";
        q7.curiosidade ="E um cristal, encontrado na região de Mogov";

        q7.escrevaQuestao();
        resp = q7.leiaResposta();
        if(q7.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q7.curiosidade);
        System.out.println("-----------------");


        Questao q8= new Questao();
        q8.pergunta = "Pergunta 8: Quem fez o primeiro motor a diesel?";
        q8.opcaoA= "a) Rudolf Diesel";
        q8.opcaoB= "b) Durand Martin";
        q8.opcaoC= "c) Garcia Bernard";
        q8.opcaoD= "d) Richard Thomas";
        q8.opcaoE= "e) Bernard Richard";
        q8.correta= "a";
        q8.curiosidade ="Os motor a diesel tem capacidade de produzir um alto torque em baixas rotações";

        q8.escrevaQuestao();
        resp = q8.leiaResposta();
        if(q8.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q8.curiosidade);
        System.out.println("-----------------");


        Questao q9= new Questao();
        q9.pergunta = "Pergunta 9: Quem inventou a lente de óculos?";
        q9.opcaoA= "a) Riccardo Romano";
        q9.opcaoB= "b) Matteo Greco";
        q9.opcaoC= "c) Salvino D'Armate";
        q9.opcaoD= "d) Alessandro Ricci";
        q9.opcaoE= "e) Nicolo Ferrari";
        q9.correta= "c";
        q9.curiosidade ="As lentes escuras, como as verdes, marrons, pretas e cinzas, absorvem mais de 80% da luz.";

        q9.escrevaQuestao();
        resp = q9.leiaResposta();
        if(q9.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q9.curiosidade);
        System.out.println("-----------------");


        Questao q10= new Questao();
        q10.pergunta = "Pergunta 10: Quantos continentes existem na Terra?";
        q10.opcaoA= "a) 8";
        q10.opcaoB= "b) 7";
        q10.opcaoC= "c) 5";
        q10.opcaoD= "d) 6";
        q10.opcaoE= "e) 9";
        q10.correta= "b";
        q10.curiosidade ="Com o movimento das placas tectônicas, a Pangeia dividiu-se inicialmente em duas partes: Gondwana e Laurásia. Daí em diante, as partes foram sendo fragmentadas, até assumirem a forma atual.";

        q10.escrevaQuestao();
        resp = q10.leiaResposta();
        if(q10.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q10.curiosidade);
        System.out.println("-----------------");



        Questao q11= new Questao();
        q11.pergunta = "Pergunta 11: Quantos anos tem um século?";
        q11.opcaoA= "a) 1000";
        q11.opcaoB= "b) 100";
        q11.opcaoC= "c) 10";
        q11.opcaoD= "d) 200";
        q11.opcaoE= "e) 10000";
        q11.correta= "b";
        q11.curiosidade ="A divisão dos séculos foi inventada pelos europeus para substituir o tempo mítico por algo relacionado às práticas sociais e agrárias.";

        q11.escrevaQuestao();
        resp = q11.leiaResposta();
        if(q11.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q11.curiosidade);
        System.out.println("-----------------");


        Questao q12= new Questao();
        q12.pergunta = "Pergunta 12: Quantas cordas tem um violão tradicional?";
        q12.opcaoA= "a) 4";
        q12.opcaoB= "b) 5";
        q12.opcaoC= "c) 7";
        q12.opcaoD= "d) 6";
        q12.opcaoE= "e) 9";
        q12.correta= "d";
        q12.curiosidade ="As cordas do violão podem ser feitas de vários materiais, como aço, nylon, níquel, prata, cobre, bronze, bronze/fósforo e latão.";

        q12.escrevaQuestao();
        resp = q12.leiaResposta();
        if(q12.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q12.curiosidade);
        System.out.println("-----------------");

        Questao q13= new Questao();
        q13.pergunta = "Pergunta 13: Quantos lados tem um triângulo?";
        q13.opcaoA= "a) 5";
        q13.opcaoB= "b) 4";
        q13.opcaoC= "c) 7";
        q13.opcaoD= "d) 9";
        q13.opcaoE= "e) 3";
        q13.correta= "e";
        q13.curiosidade ="A palavra triângulo vem do latim triangulum, que é formado por tri, que significa três, e angulus, que significa ângulo";

        q13.escrevaQuestao();
        resp = q13.leiaResposta();
        if(q13.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q13.curiosidade);
        System.out.println("-----------------");

        Questao q14= new Questao();
        q14.pergunta = "Pergunta 14: O que é o DNA?";
        q14.opcaoA= "a) Ácido ribonucleico";
        q14.opcaoB= "b) Ácido desoxirribonucleico";
        q14.opcaoC= "c) Dextro nucleico";
        q14.opcaoD= "d) Ácido nuclear de ribose";
        q14.opcaoE= "e) Ácido de nucleotídeos";
        q14.correta= "b";
        q14.curiosidade ="Mais de 99% do DNA de todos os seres humanos é igual.";

        q14.escrevaQuestao();
        resp = q14.leiaResposta();
        if(q14.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q14.curiosidade);
        System.out.println("-----------------");

        Questao q15= new Questao();
        q15.pergunta = "Pergunta 15: Quem pintou a Mona Lisa?";
        q15.opcaoA= "a) Michelangelo";
        q15.opcaoB= "b) Rafael";
        q15.opcaoC= "c) Leonardo da Vinci";
        q15.opcaoD= "d) Donatello";
        q15.opcaoE= "e) Van Gogh";
        q15.correta= "c";
        q15.curiosidade ="O quadro foi pintado entre 1503 e 1506, e mede 77 cm de altura por 53 cm de largura";

        q15.escrevaQuestao();
        resp = q15.leiaResposta();
        if(q15.isCorreta(resp))
            cont++;
        System.out.println("-----------------");
        System.out.println(q15.curiosidade);
        System.out.println("-----------------");

        double percentage = ((double) cont / 15.0) * 100;
        // Exibir o resultado final
        System.out.println("--------------------------------------------------------------------");
        System.out.println("*   RESULTADO FINAL   *");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Você acertou " + cont + " respostas.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Você errou " + (15-cont) + " respostas.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", percentage) + "%");
        System.out.println("--------------------------------------------------------------------");

        scanner.close();
    }



}
