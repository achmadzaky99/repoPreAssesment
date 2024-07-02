package id.co.prg7_assesment_057.dao.impl;


import id.co.prg7_assesment_057.dao.LayananDao;
import id.co.prg7_assesment_057.model.Layanan;
import id.co.prg7_assesment_057.repository.LayananRepository;
import id.co.prg7_assesment_057.vo.LayananVo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class LayananDaoImpl implements LayananDao{
    private final LayananRepository layananRepository;

    public LayananDaoImpl(LayananRepository layananRepository) {
        this.layananRepository = layananRepository;
    }

    @Override
    public List<LayananVo> getAllLayanans() {
        Iterable<Layanan> layanans = layananRepository.findAll();
        List<LayananVo> layananVos = new ArrayList<>();
        for (Layanan item : layanans) {
            LayananVo layananVo = new LayananVo(item);
            layananVos.add(layananVo);
        }
        return layananVos;
    }

    @Override
    public List<LayananVo> getLayananActive() {
        Iterable<Layanan> layanans = layananRepository.findAll();
        List<LayananVo> layananVos = new ArrayList<>();
        for (Layanan item : layanans) {
            LayananVo layananVo = new LayananVo(item);
            layananVos.add(layananVo);
        }
        return layananVos;
    }
}
