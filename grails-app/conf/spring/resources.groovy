// Place your Spring DSL code here
import com.desiderantes.groovytest.CustomUserDetailsService
import com.desiderantes.groovytest.UserPasswordEncoderListener

beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    userDetailsService(CustomUserDetailsService)
}
