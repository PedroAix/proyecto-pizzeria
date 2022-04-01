/**
 * Identity authorization service
 * REST API to manage user's registration and authentication, role management and token generation and validation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/**
 * Parameters required to create or update user
 */
export interface RefreshTokenParam { 
    /**
     * Refresh token to used to validate the user and generate a new token
     */
    token: string;
}