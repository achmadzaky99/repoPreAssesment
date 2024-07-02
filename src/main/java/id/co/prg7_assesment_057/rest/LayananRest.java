package id.co.prg7_assesment_057.rest;

import id.co.prg7_assesment_057.model.Layanan;
import id.co.prg7_assesment_057.response.DtoResponse;
import id.co.prg7_assesment_057.service.LayananService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/layanans")
@CrossOrigin
public class LayananRest {
    private LayananService layananService;
    public LayananRest(LayananService layananService){
        this.layananService = layananService;
    }

    @GetMapping("/getLayanans")
    public DtoResponse getLayanans(){
        return layananService.getAllLayanans();
    }


    @PostMapping("/saveLayanan")
    public DtoResponse createLayanan(@RequestBody Layanan layanan){
        return layananService.saveLayanan(layanan);
    }

    @PostMapping("/updateLayanan")
    public DtoResponse updateLayanan(@RequestBody Layanan layanan){
        return layananService.updateLayanan(layanan);
    }

    @GetMapping("/getLayananById/{id_layanan}")
    public DtoResponse getLayananById(@PathVariable Integer IdLayanan) {
        return layananService.getLayananById(IdLayanan);
    }
    @PostMapping("/deleteLayanan/{IdLayanan}")
    public DtoResponse deleteLayanan(@PathVariable Integer IdLayanan){
        return layananService.deleteLayanan(IdLayanan);
    }
}
