package com.betacom.process;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.betacom.objects.ClienteStream;
import com.betacom.objects.Generics;

public class ProcessGenerics {

	public boolean execute() {
		System.out.println("Begin Process Generics");
		
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
		
		Generics<ClienteStream> genericsList = new Generics<ClienteStream>();
		genericsList.setRc(true);
		genericsList.setDati(clienteStreamList);
		
		System.out.println(clienteStreamList);
		return true;
	}
}
