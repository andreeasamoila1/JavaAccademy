package com.betacom.process;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.betacom.objects.Cliente;
import com.betacom.objects.ClienteStream;
import com.betacom.objects.ClienteStreamMap;

public class ProcessStream {

	public boolean execute() {
		System.out.println("Begin Process Stream");
		
		/*
		 * create stream object
		 */
		Stream<ClienteStream> clienteStream = Stream.of(
				new ClienteStream("Giulia", "Pagliarani", 23, 1200.00),
				new ClienteStream("Elsa", "Morante", 79, 2000.00),
				new ClienteStream("PierPaolo", "Pasolini", 56, 1700.00),
				new ClienteStream("Luigi", "Pirandello", 88, 1600.00),
				new ClienteStream("Italo", "Svevo", 34, 1500.00),
				new ClienteStream("Italo", "Calvino", 48, 1400.00),
				new ClienteStream("Cesare", "Pavese", 44, 1300.00),
				new ClienteStream("Alberto", "Moravia", 75, 1200.00)
				);
		
		List<ClienteStream> clienteStreamList = Stream.of(
				new ClienteStream("Giulia", "Pagliarani", 23, 1200.00),
				new ClienteStream("Elsa", "Morante", 79, 2000.00),
				new ClienteStream("PierPaolo", "Pasolini", 56, 1700.00),
				new ClienteStream("Luigi", "Pirandello", 88, 1600.00),
				new ClienteStream("Italo", "Svevo", 34, 1500.00),
				new ClienteStream("Italo", "Calvino", 48, 1400.00),
				new ClienteStream("Cesare", "Pavese", 44, 1300.00),
				new ClienteStream("Alberto", "Moravia", 75, 1200.00)
				)
				.collect(Collectors.toList());
		clienteStreamList.forEach(item -> System.out.println(item));
		
		/*
		 * create stream con Builder
		 */
		Stream<String> streamBuilder = Stream.<String>builder()
				.add("Lunedi")
				.add("Martedi")
				.add("Mercoledi")
				.add("Giovedi")
				.add("Venerdi")
				.add("Sabato")
				.add("Domenica")
				.build();
		
		/*
		 * transform stream in array di stringhe
		 */
		String[] giorni = streamBuilder.toArray(size -> new String[size]);
		System.out.println("Giorni length: " + giorni.length + " giorni[4]: " + giorni[4]);
		
		/*
		 * creazione random
		 */
		Random random = new Random();
		Stream<Integer> lg = Stream.generate(() -> random.nextInt()).limit(10);
		lg.forEach(item -> System.out.println(item));
		
		/*
		 * Generazione dati primitivi
		 */
		System.out.println("Generazione interi con range");
		IntStream intStream = IntStream.range(2, 15);
		intStream.forEach(item -> System.out.println(item));
		
		
		
		/*
		 * filtro utilizzando stream
		 */
		System.out.println("*************Filter by eta < 30 **************");
		clienteStreamList.stream()
			.filter(cliente -> cliente.getEta() <30)
			.filter(cliente -> cliente.getCognome().startsWith("P"))
			.forEach(cliente-> System.out.println(cliente));
		
		/*
		 * Mapping
		 */
		System.out.println("***********Trasformazione di ClienteStream in ClienteStreamMap****************");
		List<ClienteStreamMap> clienteStreamListMap = clienteStreamList.stream()
				.map(cliente -> new ClienteStreamMap(
						cliente.getNome() + " " + cliente.getCognome(), 
						cliente.getEta(),
						cliente.getStipendio()))
				.collect(Collectors.toList());
		clienteStreamListMap.forEach(cliente ->System.out.println(cliente));
		
		/*
		 * Counting
		 */
		System.out.println("*************** funzioni di count **************");
		long count = clienteStreamList.stream()
				.filter(cliente -> cliente.getEta()>40)
				.count();
		System.out.println("numero di clienti con età > 40: " + count);
		
		
		/*
		 * Matching
		 */
		boolean clientMatching =clienteStreamList.stream()
				.anyMatch(cliente -> cliente.getCognome().startsWith("P"));
		System.out.println(clientMatching);
		
		/*
		 * Sorting
		 */
		//Primo modo
		clienteStreamList.sort(new Comparator<ClienteStream>() {

			@Override
			public int compare(ClienteStream o1, ClienteStream o2) {
				return o1.getEta() - o2.getEta();
			}
		});
		
		clienteStreamList.forEach(cliente -> System.out.println(cliente));
		
		//Secondo modo
		clienteStreamList.sort((ClienteStream o1, ClienteStream o2) -> o1.getEta() - o2.getEta());
		clienteStreamList.forEach(cliente -> System.out.println(cliente + "sort più corto"));
		
		
		return true;
	}
}
