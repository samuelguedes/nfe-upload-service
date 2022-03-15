package br.gov.resources;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import br.gov.services.ArquivoService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/envio")
public class ArquivoResource {

    @Inject
    ArquivoService arquivoService;

    @POST
    @Path("/arquivos")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public Response enviarArquivos(@MultipartForm MultipartFormDataInput input) {
        return Response.ok().entity(arquivoService.enviarArquivo(input)).build();
    }
}
