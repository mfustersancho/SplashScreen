package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import com.example.splashscreen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        AnimatorSet set = new AnimatorSet();
        Animator fadeInTituloSuperior = ObjectAnimator.ofFloat(mBinding.tituloSuperior, "alpha", 0F, 1F);
        Animator fadeInTituloInferior = ObjectAnimator.ofFloat(mBinding.tituloInferior, "alpha", 0F, 1F);
        Animator fadeInImagen_1 = ObjectAnimator.ofFloat(mBinding.imagen1, "alpha", 0F, 1F);
        Animator fadeInImagen_2 = ObjectAnimator.ofFloat(mBinding.imagen2, "alpha", 0F, 1F);
        Animator fadeInImagen_3 = ObjectAnimator.ofFloat(mBinding.imagen3, "alpha", 0F, 1F);
        Animator fadeInImagen_4 = ObjectAnimator.ofFloat(mBinding.imagen4, "alpha", 0F, 1F);
        Animator rotateImagen_1 = ObjectAnimator.ofFloat(mBinding.imagen1, "rotation", 0, 360);
        Animator rotateImagen_2 = ObjectAnimator.ofFloat(mBinding.imagen2, "rotation", 0, 360);
        Animator rotateImagen_3 = ObjectAnimator.ofFloat(mBinding.imagen3, "rotation", 0, 360);
        Animator rotateImagen_4 = ObjectAnimator.ofFloat(mBinding.imagen4, "rotation", 0, 360);
        Animator scaleXImagen_1 = ObjectAnimator.ofFloat(mBinding.imagen1, "scaleX", 0F, 1F);
        Animator scaleYImagen_1 = ObjectAnimator.ofFloat(mBinding.imagen1, "scaleY", 0F, 1F);
        Animator scaleXImagen_2 = ObjectAnimator.ofFloat(mBinding.imagen2, "scaleX", 0F, 1F);
        Animator scaleYImagen_2 = ObjectAnimator.ofFloat(mBinding.imagen2, "scaleY", 0F, 1F);
        Animator scaleXImagen_3 = ObjectAnimator.ofFloat(mBinding.imagen3, "scaleX", 0F, 1F);
        Animator scaleYImagen_3 = ObjectAnimator.ofFloat(mBinding.imagen3, "scaleY", 0F, 1F);
        Animator scaleXImagen_4 = ObjectAnimator.ofFloat(mBinding.imagen4, "scaleX", 0F, 1F);
        Animator scaleYImagen_4 = ObjectAnimator.ofFloat(mBinding.imagen4, "scaleY", 0F, 1F);
        set.play(fadeInTituloSuperior).with(fadeInImagen_1).with(rotateImagen_1).with(scaleXImagen_1).with(scaleYImagen_1)
                .with(fadeInImagen_2).with(rotateImagen_2).with(scaleXImagen_2).with(scaleYImagen_2)
                .with(fadeInImagen_3).with(rotateImagen_3).with(scaleXImagen_3).with(scaleYImagen_3)
                .with(fadeInImagen_4).with(rotateImagen_4).with(scaleXImagen_4).with(scaleYImagen_4)
                .before(fadeInTituloInferior);
        set.setDuration(2500).start();
    }
}