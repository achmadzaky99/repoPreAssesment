package id.co.prg7_assesment_057.dao;

import id.co.prg7_assesment_057.vo.LayananVo;

import java.util.List;

public interface LayananDao {
    List<LayananVo> getAllLayanans();
    List<LayananVo> getLayananActive();
}
