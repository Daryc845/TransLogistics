package com.translogistics.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class TranslogisticsController {

    //PARA ACCEDER A OTRAS CLASES(NEGOCIO) DESDE EL CONTROLLER SE LES DEBE ASIGNAR UN @AUTOWIRED PARA QUE
    //SE INYECTEN, O ESO VI YO NO SE SI HAY ALGUNA FORMA MEJOR

    //Para guardar los datos de un usuario en la sesión
    @GetMapping("/login")
    public String login(@RequestParam String name, HttpSession session) {
        session.setAttribute("usuario", name);  
        //Coleccion de datos
        
        //return "redirect:/mostrarNombre";
        return "/index";  
    }
    //Para eliminar los datos del usuario actual cuando se cierre la sesión
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();  // Borra todos los datos de la sesión
        //return "redirect:/";
        return "/index";
    }

    //GESTION DE VEHICULOS
    @GetMapping("/vehicles/manage/register")
    public String registerVehicle(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleId = 123;
        int driverId = 2321;
        String vehiclePlate = "1234ABC";
        String vehicleModel = "Toyota";
        String vehicleYear = "2020";
        String vehicleType = "Charge";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/vehicles/manage/update")
    public String updateVehicle(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleId = 123; //Se usa para identificar el vehiculo a modificar
        int driverId = 2321;
        String newVehiclePlate = "1234ABC";
        String newVehicleModel = "Toyota";
        String newVehicleYear = "2020";
        String newVehicleType = "Charge";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/vehicles/manage/desactivate")
    public String desactivateVehicle(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleId = 123; //Se usa para identificar el vehiculo a desactivar
        //Logica de negocio
        return "index";
    }

    @GetMapping("/vehicles/types/register")
    public String registerVehicleType(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleTypeId = 32;
        String vehicleTypeName = "Charge";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/vehicles/types/update")
    public String updateVehicleType(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleTypeId = 12;
        String newVehicleTypeName = "Passenger";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/vehicles/types/desactivate")
    public String desactivateVehicleType(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleTypeId = 23;
        //Logica de negocio
        return "index";
    }

//MODULO DE CONDUCTORES
    @GetMapping("/users/register")
    public String registerUser(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int userId = 42;
        String userName = "Juan Perez";
        String rol = "Driver";
        //El resto de la información depende del rol de la persona
        int[] vehiclesIds = new int[]{21,32}; //solo si es conductor
        //Logica de negocio
        return "index";
    }

    @GetMapping("/users/update")
    public String updateDriver(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int driverId = 42;
        String newDriverLicense = "123456789";
        int newDriverXP = 12;
        int[] newVehiclesIds = new int[]{21,32};
        //Logica de negocio
        return "index";
    }

    @GetMapping("/users/desactivate")
    public String desactivateDriver(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int driverId = 42;
        //Logica de negocio
        return "index";
    }

//MODULO DE VIAJES
    @GetMapping("/trips/manage/register")
    public String registerTrip(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int tripId = 32;
        int routeId = 12;
        String date = "2021-10-10";
        int vehicleId = 123;
        int driverId = 42;
        //Logica de negocio
        return "index";
    }

    @GetMapping("/trips/manage/update")
    public String updateTrip(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int tripId = 32;
        int newRouteId = 12;
        int newVehicleId = 123;
        int newDriverId = 42;
        String newDate = "2021-10-10";
        //La estructura de datos de los incidentes debe ser una estructura de alguna clase del negocio
        //Para que se pueda almacenar facilmente en la base de datos
        ArrayList<String> insidents = new ArrayList<String>();
        insidents.add("Choque");
        insidents.add("Descompostura");
        //Logica de negocio
        return "index";
    }

    @GetMapping("/trips/manage/cancel")
    public String cancelTrip(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int tripId = 32;
        //Logica de negocio
        return "index";
    }

    //Submodulo de estados
    @GetMapping("/trips/states/register")
    public String registerState(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int stateId = 32;
        String stateName = "Programed";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/trips/states/update")
    public String updateState(Model model) {
        //Valores quemados, en realidad se toman de la vista
        String stateId = "12324324";
        String newStateName = "In progress";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/trips/states/desactivate")
    public String desactivateState(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int stateId = 23;
        //Logica de negocio
        return "index";
    }

    //Submodulo de rutas
    @GetMapping("/trips/routes/register")
    public String registerRoute(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int routeId = 32;
        String origin = "Bogota";
        String destination = "Cusco";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/trips/routes/update")
    public String updateRoute(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int routeId = 21;
        String newOrigin = "Bogota";
        String newDestination = "Cusco";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/trips/routes/desactivate")
    public String desactivateRoute(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int routeId = 23;
        //Logica de negocio
        return "index";
    }

//MODULO DE MANTENIMIENTO------------------------------
    @GetMapping("/maintenance/schedulePreventive")
    public String schedulePreventiveMaintenance(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int maintenanceId = 12;
        int vehicleId = 123;
        String date = "2021-10-10";
        int cost = 1000;
        String description = "Cambio de aceite";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/maintenance/modificatePreventive")
    public String modificatePreventiveMaintenance(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int maintenanceId = 12;
        int vehicleId = 123;
        String newDate = "2021-10-10";
        int newCost = 1000;
        String newDescription = "Cambio de aceite";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/maintenance/cancelPreventive")
    public String cancelPreventiveMaintenance(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int maintenanceId = 12; 
        //Logica de negocio
        return "index";
    }

    @GetMapping("/maintenance/registerCorrective")
    public String registerCorrectiveMaintenance(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleId = 123;
        String date = "2021-10-10";
        int cost = 1000;
        String description = "Cambio de aceite";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/maintenance/modificateCorrective")
    public String modificateCorrectiveMaintenance(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int maintenanceId = 12;
        int vehicleId = 123;
        String newDate = "2021-10-10";
        int newCost = 1000;
        String newDescription = "Cambio de aceite";
        //Logica de negocio
        return "index";
    }

    @GetMapping("/maintenance/desactivatePreventive")
    public String desactivateCorrectiveMaintenance(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int maintenanceId = 12; 
        //Logica de negocio
        return "index";
    }

    @GetMapping("/maintenance/showHistorial")
    public String showMaintenanceHistorial(Model model) {
        //Valores quemados, en realidad se toman de la vista
        int vehicleId = 123;
        //Logica de negocio
        //Logica de vista
        return "index";
    }

    //PARA PRUEBAS
    @GetMapping("/index")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, @RequestParam(name="message", required=false, defaultValue="World") String message, Model model) {
        //model.addAttribute("name", name);
        //System.out.println(model.getAttribute("message"));
        TextForm textForm = new TextForm();
        textForm.setContent("Hola");
        model.addAttribute("textForm", textForm);
        return "index";
    }
    @PostMapping("/index")  
    public String processText(@ModelAttribute TextForm textForm, Model model) {
        String inputText = textForm.getContent();
        model.addAttribute("mensaje", "Texto recibido: " + inputText);
        System.out.println(inputText);
        textForm.setContent("STALIN");
        model.addAttribute("textForm", textForm);
        //return "redirect:/index";
        return "index"; 
    }
    
}
