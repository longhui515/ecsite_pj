package com.example.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration // このクラスは設定用のクラスであるとSpringに知らせる
public class SecurityConfig {

    @Bean // このメソッドの返り値をSpringコンテナにBeanとして登録する
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // BCryptPasswordEncoderをインスタンス化して返す
    }

    //TODO CSRF対策追加
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf
//                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()) // CookieでCSRFトークンを管理
//                )
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/login", "/create").permitAll() // ログイン・登録は許可
//                        .anyRequest().authenticated() // それ以外は認証が必要
//                );
//
//        return http.build();
//    }
}
