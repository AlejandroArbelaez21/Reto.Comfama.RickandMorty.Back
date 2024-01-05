package com.comfama.reto.api.rest;

import com.comfama.reto.api.business.RetoBusinessImpl;
import com.comfama.reto.api.model.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/character")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RetoRest {
    private RetoBusinessImpl retoBusinessImpl;

    // constructor
    public RetoRest(RetoBusinessImpl retoBusinessImpl) {
        super();
        this.retoBusinessImpl = retoBusinessImpl;
    }

    /**
     * GET endpoint to retrieve all characters
     *
     * @return A Response object containing the all characters.
     */
    @GetMapping("/")
    public Response getCharacters() {
        return retoBusinessImpl.getCharacters();
    }

    /**
     * GET endpoint to retrieve characters by page ID.
     *
     * @param id The ID of the page to retrieve characters from.
     * @return A Response object containing the characters for the specified page.
     */
    @GetMapping(value = "/page/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getCharacterById(@PathVariable(value = "id", required = true) Long id) {
        return retoBusinessImpl.getCharactersByPage(id);
    }

    /**
     * GET endpoint to retrieve characters by specie.
     *
     * @param specie The specie to filter characters.
     * @return A Response object containing the characters of the specified specie.
     */
    @GetMapping(value = "/specie/{specie}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getCharactersBySpecie(@PathVariable(value = "specie", required = true) String specie) {
        return retoBusinessImpl.getCharactersBySpecie(specie);
    }

    /**
     * GET endpoint to retrieve characters by page and specie.
     *
     * @param id The page ID.
     * @param specie The specie to filter characters.
     * @return A Response object containing the characters of the specified page and specie.
     */
    @GetMapping(value = "/page/{id}/specie/{specie}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getCharactersByPageBySpecie(@PathVariable(value = "id", required = true) Long id, @PathVariable(value = "specie", required = true) String specie) {
        return retoBusinessImpl.getCharactersByPageBySpecie(id, specie);
    }

    /**
     * GET endpoint to retrieve characters by page and gender.
     *
     * @param id The page ID.
     * @param gender The gender to filter characters.
     * @return A Response object containing the characters of the specified page and gender.
     */
    @GetMapping(value = "/page/{id}/gender/{gender}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getCharactersByPageByGender(@PathVariable(value = "id", required = true) Long id, @PathVariable(value = "gender", required = true) String gender) {
        return retoBusinessImpl.getCharactersByPageByGender(id, gender);
    }

    /**
     * GET endpoint to retrieve characters by gender.
     *
     * @param gender The gender to filter characters.
     * @return A Response object containing the characters of the specified gender.
     */
    @GetMapping(value = "/gender/{gender}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getCharactersByGender(@PathVariable(value = "gender", required = true) String gender) {
        return retoBusinessImpl.getCharactersByGender(gender);
    }

    /**
     * GET endpoint to retrieve all favorite characters.
     *
     * @return A list of Favorite objects representing the favorite characters.
     */
    @GetMapping(value = "/favorite", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Favorite> getAllFavorite() {
        return retoBusinessImpl.getAllFavorite();
    }

    /**
     * POST endpoint to add a character to the favorites list.
     *
     * @param id_character The ID of the character to be added to the favorites.
     * @return A Favorite object representing the added character in the favorites.
     */
    @PostMapping(value = "/favorite/{id_character}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Favorite AddCharacterFavorite(@PathVariable(value = "id_character", required = true) Long id_character) {
        return retoBusinessImpl.AddCharacterFavorite(id_character);
    }

    /**
     * DELETE endpoint to remove a character from the favorites list.
     *
     * @param id_character The ID of the character to be removed from the favorites.
     * @return A Favorite object representing the removed character from the favorites.
     */
    @DeleteMapping(value = "/favorite/{id_character}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Favorite deleteCharacterFavorite(@PathVariable(value = "id_character", required = true) Long id_character) {
        return retoBusinessImpl.deleteCharacterFavorite(id_character);
    }


    /**
     * GET endpoint to retrieve information about favorite characters based on their IDs.
     *
     * @param ids The list of character IDs for which information is requested.
     * @return A ResponseEntity containing the information about the requested favorite characters.
     */
    @GetMapping(value = "/getInfo")
    public ResponseEntity<Object> getCharactersFavorite(@RequestParam List<Long> ids) {
        return retoBusinessImpl.getCharactersFavorite(ids);
    }


}
