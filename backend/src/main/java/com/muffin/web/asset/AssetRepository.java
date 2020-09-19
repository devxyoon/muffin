package com.muffin.web.asset;
import com.muffin.web.stock.Stock;
import com.muffin.web.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long>, IAssetRepository{

    Asset findByStock(Stock stock);

    ArrayList<Asset> findByUser(User user);
}