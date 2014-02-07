package io.segment.android.cache;

import io.segment.android.models.EasyJSONObject;
import io.segment.android.request.IRequester;
import io.segment.android.utils.LooperThreadWithHandler;
import android.os.Handler;

/**
 * A Looper/Handler backed settings thread
 *
 */
public class SettingsThread extends LooperThreadWithHandler implements ISettingsLayer {
	
	private IRequester requester;

	public SettingsThread(IRequester requester) {
		this.requester = requester;
	}

	@Override
	public void fetch(final SettingsCallback callback) {
		Handler handler = handler();
		handler.post(new Runnable() {
			@Override
			public void run() {
				EasyJSONObject object = new EasyJSONObject();
				if (callback != null) callback.onSettingsLoaded(object != null, object);
			}
		});
	}	
}