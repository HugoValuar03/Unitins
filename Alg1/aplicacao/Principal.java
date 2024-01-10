package aplicacao;

public class Principal {
	
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setDataNascimento(03, 01, 2005);
		
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getDataNascimento());
		
		
		
//		LocalTime tempo = LocalTime.now();
//		
//		DateTimeFormatter formatter =
//				DateTimeFormatter.ofPattern("hh:mm:ss");
//		
//		System.out.println(tempo.format(formatter));
//		System.out.println(tempo);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Informe uma data no seguinte formato: Ex. 01/12/2020 ");
//		String dataEntrada = scan.next();
//		
//		LocalDate data = LocalDate.parse(dataEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		
//		System.out.println(data);
		
		
//		LocalDate data = LocalDate.parse("2023-09-05");
//		System.out.println(data);
//		System.out.println("Dia do mes: " + data.getDayOfMonth());
		
		
		

//		
//		System.out.println("Informe a data de aniversario: ");
//		System.out.println("Informe o dia: ");
//		int dia = scan.nextInt();
//		
//		System.out.println("Informe o mes: ");
//		int mes = scan.nextInt();
//		
//		System.out.println("Informe o ano: ");
//		int ano = scan.nextInt();
//		
//		LocalDate data = LocalDate.of(ano, mes, dia);
//		
		
//		//pegar data do dia
//		//LocalDate data = LocalDate.now(); //O "now" significa agora, vai pegar a data do computador, se a data do computador tiver errada vai pegar a data errada
//		
//		//seter uma nova data
//		LocalDate data = LocalDate.of(2023, 11, 20);
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
//		String dataFormatada = data.format(formatter);
//		
//		//adicionando dia
//		LocalDate novaData = data.plusDays(45);
//		
//		//diminuindo mes
//		LocalDate dataAntiga = data.minusMonths(5); 
//		
//		System.out.println(dataFormatada);
//		System.out.println(data);
//		System.out.println(novaData);
//		System.out.println(dataAntiga);
	}
}
