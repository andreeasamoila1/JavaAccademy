package com.betacom.process;

import java.util.ArrayList;
import java.util.List;

import com.betacom.objects.Cliente;
import com.betacom.objects.DataNascita;
import com.google.gson.Gson;

public class ProcessJson {

	public boolean execute() {

		Cliente cliente = new Cliente("Carlo", "Bruni", new DataNascita(1, 10, 1999));

		Gson gson = new Gson();

		String jsonString = gson.toJson(cliente);
		System.out.println("Object to json: " + jsonString);

		Cliente newCliente = gson.fromJson(jsonString, Cliente.class);
		System.out.println("Classe generata: " + newCliente);

		List<Cliente> clientsList = new ArrayList<Cliente>();
		clientsList.add(new Cliente("Giovanni", "Vercelli", new DataNascita(1, 10, 1999)));
		clientsList.add(new Cliente("Marta", "Brunelli", new DataNascita(11, 8, 2002)));
		clientsList.add(new Cliente("Giorgio", "Rossi", new DataNascita(28, 7, 2005)));
		clientsList.add(new Cliente("Martina", "Bianchi", new DataNascita(10, 1, 1992)));
		clientsList.add(new Cliente("Riccardo", "Pagliarani", new DataNascita(19, 11, 2000)));

		jsonString = gson.toJson(clientsList);
		for (int i = 0; i < jsonString.length(); i++) {
			jsonString.split("}},");
			System.out.println("Lista json: " + jsonString);
		}
		List<Cliente> res = gson.fromJson(jsonString, List.class);
		System.out.println("List generata: " + res);
		return true;
	}
}
