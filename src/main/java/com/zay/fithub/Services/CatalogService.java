package com.zay.fithub.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zay.fithub.Entities.Catalog;
import com.zay.fithub.Repositories.CatalogRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CatalogService {
    private final CatalogRepository catalogRepository;

    public CatalogService(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public Catalog createCatalog(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    public List<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }

    public Catalog getCatalogById(String id) {
        return catalogRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Catalog not found with id: " + id));
    }

    public Catalog updateCatalog(String id, Catalog updatedCatalog) {
        Catalog existingCatalog = getCatalogById(id);
        existingCatalog.setProducts(updatedCatalog.getProducts());
        // Update other fields as needed
        return catalogRepository.save(existingCatalog);
    }

    public void deleteCatalog(String id) {
        Catalog existingCatalog = getCatalogById(id);
        catalogRepository.delete(existingCatalog);
    }
}
