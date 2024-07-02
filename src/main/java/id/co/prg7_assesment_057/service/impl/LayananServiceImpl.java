package id.co.prg7_assesment_057.service.impl;

import id.co.prg7_assesment_057.dao.LayananDao;
import id.co.prg7_assesment_057.model.Layanan;
import id.co.prg7_assesment_057.repository.LayananRepository;
import id.co.prg7_assesment_057.response.DtoResponse;
import id.co.prg7_assesment_057.service.LayananService;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static id.co.prg7_assesment_057.constant.LayananConstant.*;

@Service
@Transactional
public class LayananServiceImpl implements LayananService {
    @Autowired
    private LayananDao layananDao;

    @Autowired
    private LayananRepository layananRepository;

    @Override
    public DtoResponse getAllLayanans() {
        if(layananDao.getAllLayanans() != null){
            return new DtoResponse(200, layananDao.getAllLayanans());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse saveLayanan(Layanan layanan) {
        try {
            layananRepository.save(layanan);
            return new DtoResponse(200, layanan, mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500, layanan, mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateLayanan(Layanan layanan) {
        try {
            Layanan existingLayanan = layananRepository.findById(layanan.getIdLayanan()).orElse(null);

            if (existingLayanan == null) {
                return new DtoResponse(404, null, mNotFound);
            }

            // Update the fields
            existingLayanan.setNamaLayanan(layanan.getNamaLayanan());
            existingLayanan.setDeskripsiLayanan(layanan.getDeskripsiLayanan());
            existingLayanan.setHargaLayanan(layanan.getHargaLayanan());
            existingLayanan.setStatusLayanan(layanan.getStatusLayanan());

            Layanan updatedLayanan = layananRepository.save(existingLayanan);

            return new DtoResponse(200, updatedLayanan, mUpdateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, layanan, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteLayanan(Integer idLayanan) {
        Layanan layananData = layananRepository.findById(idLayanan).orElseThrow();
        if(layananData != null){
            try{
                layananRepository.delete(layananData);
                return new DtoResponse(200, layananData, mDeleteSucess);
            }catch (Exception e){
                return new DtoResponse(500, layananData, mDeleteFailed);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }

    @Override
    public DtoResponse getLayananById(Integer idLayanan) {
        try {
            Layanan layanan = layananRepository.findById(idLayanan).orElse(null);
            if (layanan != null) {
                return new DtoResponse(200, layanan);
            } else {
                return new DtoResponse(404, null, "Layanan dengan ID " + idLayanan + " tidak ditemukan.");
            }
        } catch (Exception e) {
            return new DtoResponse(500, null, "Gagal mengambil data Layanan: " + e.getMessage());
        }
    }
}
