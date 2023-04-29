package grupo2.laboratorio1.bda.services;

import grupo2.laboratorio1.bda.models.EstadoTarea;
import grupo2.laboratorio1.bda.repositories.EstadoTareaRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoTareaService {
    @Autowired
    EstadoTareaRepository estadoTareaRepository;

    public void createEstadoTarea(@NonNull Integer idEstadoTarea,
                                String descripcion){
        EstadoTarea estadoTarea = new EstadoTarea(idEstadoTarea, descripcion);
        estadoTareaRepository.createEstadoTarea(estadoTarea);
    }

    public EstadoTarea getEstadoTarea(@NonNull Integer idEstadoTarea){
        //if(!existsEstadoTarea(idEstadoTarea)){
        //  throw new IllegalArgumentException("No existe el estado de la tarea");
        //}
        return estadoTareaRepository.getEstadoTarea(idEstadoTarea);
    }

    public List<EstadoTarea> getAllEstadoTareas(){
        return estadoTareaRepository.getAllEstadoTareas();
    }

    public void updateEstadoTarea(Integer idEstadoTarea, EstadoTarea estadoTarea){
        estadoTarea.setIdEstadoTarea(idEstadoTarea);
        //vaildateEstadoTarea(estadoTarea);

        estadoTareaRepository.updateEstadoTarea(estadoTarea);
    }

    public void deleteEstadoTarea(Integer idEstadoTarea){
        //if(!existsEstadoTarea(idEstadoTarea)){
        //    throw new IllegalArgumentException("No existe el estado de tarea");
        //}

        estadoTareaRepository.deleteEstadoTarea(idEstadoTarea);
    }
}
