package com.esquibel;

import com.esquibel.dao.ClienteDao;
import com.esquibel.model.Cliente;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("2704", "Carla Cecilia Diaz", "Cochabamba", "C/Juan Pablo II nº308", 42854475);
        //Cliente Laura = new Cliente("25402", "Laura Meneces", "Cochabamba", "C/Juan Pablo II nº309", 759314457);
        //Cliente Lorena = new Cliente("18532", "Lorena Dias", "Cochabamba", "C/Juan Pablo II nº310", 8888312);
        //Cliente Miguel = new Cliente("0704-99", "Miguel Miranda", "Cochabamba", "C/Juan Pablo II nº311", 9682372);
        //Cliente Luis = new Cliente("6532", "Luis Siles", "Cochabamba", "C/Juan Pablo II nº312", 4737382);
        //Cliente Carmen = new Cliente("98654", "Carmen Salinas", "Cochabamba", "C/Juan Pablo II nº313", 4793211);

        //CRUD TABLA CLIENTES
        ClienteDao clienteDao = new ClienteDao();
        //CREATE
        //clienteDao.addCliente(Laura);
        //clienteDao.addCliente(Lorena);
        //clienteDao.addCliente(Miguel);
        //clienteDao.addCliente(Luis);
        //clienteDao.addCliente(Carmen);


        //READ
        /*
        List<Cliente> clientes = clienteDao.getAllClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);
        }
        */
        //UPDATE
        //Cliente cliente = new Cliente("0208", "Fernando Torrico", "Cochabamba", "C/Francisco Pizarro", 4283475);
        //ClienteDao.updateCliente(cliente);

        //DELETE
        ClienteDao.deleteCliente("98654");
        ClienteDao.deleteCliente("6532");
    }
}



