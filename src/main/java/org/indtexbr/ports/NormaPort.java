package org.indtexbr.ports;

import java.util.List;
import java.util.UUID;

import org.indtexbr.entities.NormaEntity;

public interface NormaPort {

	public void inserirNorma(NormaEntity normaEntity);
	public List<NormaEntity> consultarNormas();
	public NormaEntity consultarNorma(UUID idNorma);
	public void alterarNorma(NormaEntity normaEntity);
	public void deletarNorma(UUID idNorma);
}
