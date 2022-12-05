package service;

import model.WalletManagement;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class WalletManagementImpl implements IWalletService{
    @Override
    public List<WalletManagement> findAll(HttpServletRequest request) {
        return null;
    }

    @Override
    public WalletManagement findById(HttpServletRequest request) {
        return null;
    }

    @Override
    public boolean add(HttpServletRequest request) {
        return false;
    }

    @Override
    public boolean edit(HttpServletRequest request) {
        return false;
    }

    @Override
    public boolean deleteById(HttpServletRequest request) {
        return false;
    }

    @Override
    public List<WalletManagement> findByNameContaining(HttpServletRequest request) {
        return null;
    }
}
