package com.comfama.reto.api.business;
import com.comfama.reto.api.domain.ErrorResponse;
import com.comfama.reto.api.model.Character;
import com.comfama.reto.api.model.Favorite;
import com.comfama.reto.api.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import com.comfama.reto.api.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class implementing business logic for the Reto application.
 * 
 * @author alejandro.arbelaez
 *
 */
@Service
public class RetoBusinessImpl {
	// Url base of the API
	private final String apiUrl = "https://rickandmortyapi.com/api/character";

	private final RestTemplate restTemplate;

	@Autowired
	private FavoriteRepository favoriteRepository;

	// constructor
	public RetoBusinessImpl(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	/**
	 * Retrieves information about all characters.
	 *
	 * @return A Response object containing information about the characters.
	 */
	public Response getCharacters() {
		try {
			return restTemplate.getForObject(apiUrl, Response.class);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getCharacters()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}

	/**
	 * Retrieves information about characters on a specific page.
	 *
	 * @param id Page number.
	 * @return A Response object containing information about characters on the specified page.
	 */
	public Response getCharactersByPage(Long id) {
		try {
			String url = apiUrl + "/?page=" + id;
			return restTemplate.getForObject(url, Response.class);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getCharactersByPage()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}

	/**
	 * Retrieves information about characters of a specific species.
	 *
	 * @param specie Species name.
	 * @return A Response object containing information about characters of the specified species.
	 */
	public Response getCharactersBySpecie(String specie) {
		try {
			String url = apiUrl + "/?species=" + specie;
			return restTemplate.getForObject(url, Response.class);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getCharactersBySpecie()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}

	/**
	 * Retrieves information about characters on a specific page and species.
	 *
	 * @param id     Page number.
	 * @param specie Species name.
	 * @return A Response object containing information about characters on the specified page and species.
	 */
	public Response getCharactersByPageBySpecie(Long id, String specie) {
		try {
			String url = apiUrl + "/?page=" + id + "&species=" + specie;
			return restTemplate.getForObject(url, Response.class);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getCharactersByPageBySpecie()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}

	/**
	 * Retrieves information about characters on a specific page and gender.
	 *
	 * @param id     Page number.
	 * @param gender Gender of the characters.
	 * @return A Response object containing information about characters on the specified page and gender.
	 */
	public Response getCharactersByPageByGender(Long id, String gender) {
		try {
			String url = apiUrl + "/?page=" + id + "&gender=" + gender;
			return restTemplate.getForObject(url, Response.class);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getCharactersByPageByGender()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}

	/**
	 * Retrieves information about characters of a specific gender.
	 *
	 * @param gender Gender of the characters.
	 * @return A Response object containing information about characters of the specified gender.
	 */
	public Response getCharactersByGender(String gender) {
		try	{
			String url = apiUrl + "/?gender=" + gender;
			return restTemplate.getForObject(url, Response.class);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getCharactersByGender()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}

	/**
	 * Adds a character to the list of favorites.
	 *
	 * @param characterId ID of the character to be added.
	 * @return A Favorite object representing the character added to favorites.
	 */
	public Favorite AddCharacterFavorite(Long characterId) {
		try {
			Favorite favorite = new Favorite();
			favorite.setCharacterId(characterId);
			return favoriteRepository.save(favorite);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain AddCharacterFavorite()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;

	}

	/**
	 * Deletes a character from the list of favorites.
	 *
	 * @param characterId ID of the character to be deleted from favorites.
	 * @return A Favorite object representing the character deleted from favorites.
	 */
	@Transactional
	public Favorite deleteCharacterFavorite(Long characterId) {
		try {
			favoriteRepository.deleteByCharacterId(characterId);
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain deleteCharacterFavorite()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}

	/**
	 * Retrieves all characters marked as favorites.
	 *
	 * @return A list of Favorite objects representing favorite characters.
	 */
	public List<Favorite> getAllFavorite() {
		try {
			return favoriteRepository.findAll();
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getAllFavorite()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;

	}

	/**
	 * Retrieves information about favorite characters based on their IDs.
	 *
	 * @param ids List of IDs of favorite characters.
	 * @return ResponseEntity containing information about the requested favorite characters.
	 */
	public ResponseEntity<Object> getCharactersFavorite(@RequestParam List<Long> ids) {
		try {
			// Build the URL with the list of IDs
			String url = UriComponentsBuilder.fromHttpUrl(apiUrl)
					.path("/" + ids.stream().map(Object::toString).collect(Collectors.joining(",")))
					.build().toUriString();
			System.out.println("URL construida: " + url);

			// Make the GET request
			ResponseEntity<Object> responseEntity = restTemplate.getForEntity(url, Object.class);

			// Check if the response is an array or a single object
			if (responseEntity.getBody() instanceof List) {
				return ResponseEntity.ok(responseEntity.getBody());
			} else {
				// If the response is an object, wrap it in a list before returning
				return ResponseEntity.ok(Collections.singletonList(responseEntity.getBody()));
			}
		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setUserMessage("An error occurred trying to obtain getCharactersBySpecie()");
			errorResponse.setDeveloperMessage(e.toString());
			errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		}
		return null;
	}
}
