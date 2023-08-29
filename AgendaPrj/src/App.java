import javax.swing.JOptionPane;
public class App {
	public static void main (String[]args) {
		String nome,  horario,data, local ;
		
		Evento e = new Evento();
		Tarefa t = new Tarefa();
		Aniversario a = new Aniversario();
		Lembrete l = new Lembrete();
		
		
		Object [] escolha = {"Evento","tarefa","aniversário","Lembrete","sair"};
		
	String op = JOptionPane.showInputDialog(null, "Selecione a função da agenda ","Agenda",
				JOptionPane.QUESTION_MESSAGE,null,escolha,escolha[1]).toString();

		if(op==escolha[0]) {
			String n =JOptionPane.showInputDialog("Digite o nome do evento");
			nome = n;
			e.cadastrar();
			String lo=JOptionPane.showInputDialog("Digite o local do evento");
			local=lo;
			e.cadastrar();
			String  d =JOptionPane.showInputDialog("Digite a data do evento");
			data  = d;
			e.cadastrar();
			String  h =JOptionPane.showInputDialog("Digite o Horario do evento");
			horario = h;
			e.cadastrar();
			JOptionPane.showMessageDialog(null, "Seu evento  " + nome+ "Em" +local+ " está agendado para a data " +data+ "e horário" +horario);

		}else if(op==escolha[1]) {
			String n =JOptionPane.showInputDialog("Digite o nome da tarefa");
				nome = n;
				t.cadastrar();
				String  d =JOptionPane.showInputDialog("Digite a data  da tarefa");
				data  = d;
				t.cadastrar();
				String  h =JOptionPane.showInputDialog("Digite o Horario da tarefa");
				horario = h;
				t.cadastrar();
				
				JOptionPane.showMessageDialog(null, "Sua   " + nome+ " deve ser realizada na data de  " +data+ "e horário" +horario);
				
		}else if(op==escolha[2]) {
			String n = JOptionPane.showInputDialog("Digite o nome do aniversáriante ");
			nome=n;
			a.cadastrar();
			String d =JOptionPane.showInputDialog("Digite a data do aniversariante ");
			data=d;
			a.cadastrar();
			JOptionPane.showMessageDialog(null, " Dia  " + data+ " será aniversário de  " +nome);

					
		}else if(op==escolha [3]) {
			String n =JOptionPane.showInputDialog("Digite o nome do Lembrete  ");
			nome=n;
			l.cadastrar();
			String d =JOptionPane.showInputDialog("Digite a data do Lembrete ");
			data=d;
			l.cadastrar();
			String  h =JOptionPane.showInputDialog("Digite o Horario do Lembrete");
			horario = h;
			l.cadastrar();
			JOptionPane.showMessageDialog(null, "Lembrete   " + nome+ "" +data+ "as" +horario);

			
			
		}else if (op==escolha[4]) {
									
			JOptionPane.showMessageDialog(null, "Obrigada por usar a agenda  " );


			
		
						
				
			
			
		}
	}
}
				
				
		

