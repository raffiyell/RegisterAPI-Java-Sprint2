package edu.uark.models.repositories.interfaces;
import edu.uark.dataaccess.repository.BaseRepositoryInterface;
import edu.uark.models.entities.ProductEntity;
import edu.uark.models.entities.TransactionEntity;

public interface TransactionRepositoryInterface extends BaseRepositoryInterface<TransactionEntity>{
	TransactionEntity byCashierId(int cashierId);
}
