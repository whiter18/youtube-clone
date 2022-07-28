import { NgModule } from '@angular/core';
import { AuthModule } from 'angular-auth-oidc-client';


@NgModule({
    imports: [AuthModule.forRoot({
        config: {
            authority: 'https://dev-i319pfnf.us.auth0.com',
            redirectUrl: window.location.origin,
            clientId: 'OzAlzU5J9WInOnTVyQcBxPjKXFlogRlB',
            scope: 'openid profile offline_access email',
            responseType: 'code',
            silentRenew: true,
            useRefreshToken: true,
            secureRoutes: ['http://localhost:8080'],
            customParamsAuthRequest : {
              audience: 'http://localhost:8080'
            }
        }
      })],
    providers: [],
    exports: [AuthModule],
})
export class AuthConfigModule {}
