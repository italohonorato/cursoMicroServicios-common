package cl.teamweichafe.common.mappers;

import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;

public interface MapperUtil<F, T> {

    default List<T> toDtoList(List<F> listFrom, Class<T> toClass){
        List<T> listMap = listFrom.stream().map(item -> getMapper().map(item, toClass)).collect(Collectors.toList());

        return listMap;
    }

    default List<F> toEntityList(List<T> listFrom, Class<F> toClass){
        List<F> listMap = listFrom.stream().map(item -> getMapper().map(item, toClass)).collect(Collectors.toList());

        return listMap;
    }

    ModelMapper getMapper();
}
