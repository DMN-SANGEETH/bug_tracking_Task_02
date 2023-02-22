package com.entgra.Task_02.service.impl;

import com.entgra.Task_02.dto.request.StatusRequestDTO;
import com.entgra.Task_02.service.StatusService;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class StatusServiceIMPL implements StatusService {
    @Override
    public StatusRequestDTO updateStatus(StatusRequestDTO statusRequestDTO) {
        return null;
    }
}
