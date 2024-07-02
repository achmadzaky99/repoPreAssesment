package id.co.prg7_assesment_057.service;
import id.co.prg7_assesment_057.model.Layanan;
import id.co.prg7_assesment_057.response.DtoResponse;


public interface LayananService {
    DtoResponse getAllLayanans();
    DtoResponse saveLayanan(Layanan layanan);
    DtoResponse updateLayanan(Layanan layanan);
    DtoResponse deleteLayanan(Integer IdLayanan);
    DtoResponse getLayananById(Integer IdLayanan);


}
