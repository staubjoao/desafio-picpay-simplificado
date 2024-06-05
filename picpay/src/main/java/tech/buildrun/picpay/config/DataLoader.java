package tech.buildrun.picpay.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import tech.buildrun.picpay.entity.TipoCarteira;
import tech.buildrun.picpay.repository.TipoCarteiraRepository;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner{

    private final TipoCarteiraRepository tipoCarteiraRepository;

    public DataLoader(TipoCarteiraRepository tipoCarteiraRepository) {
        this.tipoCarteiraRepository = tipoCarteiraRepository;
    }

    @Override
    public void run(String... args) {
        Arrays.stream(TipoCarteira.Enum.values()).forEach(tipoCarteira -> tipoCarteiraRepository.save(tipoCarteira.get()));
    }
}
