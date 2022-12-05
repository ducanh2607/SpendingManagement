package service;

import model.WalletManagement;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IWalletService extends ICoreCRUDService<WalletManagement,Long> {
    List<WalletManagement> findByNameContaining(HttpServletRequest request);
}
