package com.zay.fithub.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zay.fithub.Entities.Catalog;
import com.zay.fithub.Services.CatalogService;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {
    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @PostMapping
    public Catalog createCatalog(@RequestBody Catalog catalog) {
        return catalogService.createCatalog(catalog);
    }

    @GetMapping
    public List<Catalog> getAllCatalogs() {
        return catalogService.getAllCatalogs();
    }

    @GetMapping("/{id}")
    public Catalog getCatalogById(@PathVariable String id) {
        return catalogService.getCatalogById(id);
    }

    @PutMapping("/{id}")
    public Catalog updateCatalog(@PathVariable String id, @RequestBody Catalog catalog) {
        return catalogService.updateCatalog(id, catalog);
    }

    @DeleteMapping("/{id}")
    public void deleteCatalog(@PathVariable String id) {
        catalogService.deleteCatalog(id);
    }
}
