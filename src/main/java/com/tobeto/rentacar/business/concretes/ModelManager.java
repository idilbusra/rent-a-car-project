package com.tobeto.rentacar.business.concretes;

import com.tobeto.rentacar.business.abstracts.ModelService;
import com.tobeto.rentacar.business.dtos.requests.CreateModelRequest;
import com.tobeto.rentacar.business.dtos.responses.CreatedModelResponse;
import com.tobeto.rentacar.business.dtos.responses.GetAllModelResponse;
import com.tobeto.rentacar.core.utilities.mapping.ModelMapperService;
import com.tobeto.rentacar.dataAccess.abstracts.ModelRepository;
import com.tobeto.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Service
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreatedModelResponse add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
        model.setId(0);
        model.setCreatedDate(LocalDateTime.now());
        Model createdModel = this.modelRepository.save(model);
        CreatedModelResponse createdModelResponse =
                this.modelMapperService.forResponse().map(createdModel, CreatedModelResponse.class);
        return createdModelResponse;
    }

    @Override
    public List<GetAllModelResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModelResponse> modelResponses = models.stream().map(model -> modelMapperService.forResponse()
                .map(model, GetAllModelResponse.class)).toList();
        return modelResponses;
    }
}
