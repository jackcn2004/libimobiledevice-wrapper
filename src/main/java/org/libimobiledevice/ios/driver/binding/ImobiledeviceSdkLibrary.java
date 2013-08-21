/*
 * Copyright 2012-2013 eBay Software Foundation and ios-driver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.libimobiledevice.ios.driver.binding;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
/**
 * JNA Wrapper for library <b>imobiledevice-sdk</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ImobiledeviceSdkLibrary implements Library {
	public static final String JNA_LIBRARY_NAME = "imobiledevice-sdk";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(ImobiledeviceSdkLibrary.JNA_LIBRARY_NAME);
	static {
		Native.register(ImobiledeviceSdkLibrary.class, ImobiledeviceSdkLibrary.JNA_NATIVE_LIB);
	}
	public static interface sdk_idevice_app_type_t {
		public static final int IDEVICE_APP_TYPE_USER = 1;
		public static final int IDEVICE_APP_TYPE_SYSTEM = 2;
		public static final int IDEVICE_APP_TYPE_ALL = (int)ImobiledeviceSdkLibrary.sdk_idevice_app_type_t.IDEVICE_APP_TYPE_USER | (int)ImobiledeviceSdkLibrary.sdk_idevice_app_type_t.IDEVICE_APP_TYPE_SYSTEM;
		public static final int IDEVICE_APP_TYPE_DEFAULT = 1;
	};
	public static class sdk_idevice_app_info_t extends Structure {
		public String bundle_identifier;
		public String display_name;
		public String version;
		public sdk_idevice_app_info_t() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("bundle_identifier", "display_name", "version");
		}
		public sdk_idevice_app_info_t(String bundle_identifier, String display_name, String version) {
			super();
			this.bundle_identifier = bundle_identifier;
			this.display_name = display_name;
			this.version = version;
		}

                public sdk_idevice_app_info_t(Pointer p){
                  super(p);
                }
		public static class ByReference extends sdk_idevice_app_info_t implements Structure.ByReference {
			
		};
		public static class ByValue extends sdk_idevice_app_info_t implements Structure.ByValue {
			
		};
	};
	public interface sdk_idevice_installation_service_status_cb_t extends Callback {
		void apply(Pointer operation, Pointer message, int precent_complete, Pointer user_data);
	};
	public interface sdk_idevice_syslog_service_read_cb_t extends Callback {
		void apply(byte c, Pointer user_data);
	};
	@Deprecated 
	public static native void sdk_idevice_free_string(Pointer s);
	public static native void sdk_idevice_free_string(ByteBuffer s);
	public static native void sdk_idevice_set_debug_level(int level);
	@Deprecated 
	public static native short sdk_idevice_new_from_idevice(Pointer sdk_device, Pointer idevice);
	public static native short sdk_idevice_new_from_idevice(PointerByReference sdk_device, Pointer idevice);
	@Deprecated 
	public static native short sdk_idevice_new(Pointer sdk_device, Pointer udid);
	public static native short sdk_idevice_new(PointerByReference sdk_device, String udid);
	public static native short sdk_idevice_new(PointerByReference sdk_device, Pointer udid);
	@Deprecated 
	public static native short sdk_idevice_free(Pointer sdk_device);
	public static native short sdk_idevice_free(ImobiledeviceSdkLibrary.sdk_idevice_t sdk_device);
	@Deprecated 
	public static native Pointer sdk_idevice_get_idevice(Pointer sdk_device);
	public static native Pointer sdk_idevice_get_idevice(ImobiledeviceSdkLibrary.sdk_idevice_t sdk_device);
	@Deprecated 
	public static native short information_service_new(Pointer device, Pointer service);
	public static native short information_service_new(ImobiledeviceSdkLibrary.sdk_idevice_t device, PointerByReference service);
	public static native short information_service_new(Pointer device, PointerByReference service);
	@Deprecated 
	public static native short information_service_free(Pointer service);
	public static native short information_service_free(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service);
	@Deprecated 
	public static native short information_service_get_device_name(Pointer service, PointerByReference device_name);
	public static native short information_service_get_device_name(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, PointerByReference device_name);
	@Deprecated 
	public static native short information_service_set_device_name(Pointer service, Pointer device_name);
	public static native short information_service_set_device_name(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, String device_name);
	@Deprecated 
	public static native short information_service_get_device_type(Pointer service, PointerByReference device_type);
	public static native short information_service_get_device_type(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, PointerByReference device_type);
	@Deprecated 
	public static native short information_service_get_product_version(Pointer service, PointerByReference product_version);
	public static native short information_service_get_product_version(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, PointerByReference product_version);
	@Deprecated 
	public static native short information_service_get_language(Pointer service, PointerByReference language_code);
	public static native short information_service_get_language(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, PointerByReference language_code);
	@Deprecated 
	public static native short information_service_set_language(Pointer service, Pointer language_code);
	public static native short information_service_set_language(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, String language_code);
	@Deprecated 
	public static native short information_service_get_locale(Pointer service, PointerByReference locale_code);
	public static native short information_service_get_locale(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, PointerByReference locale_code);
	@Deprecated 
	public static native short information_service_set_locale(Pointer service, Pointer locale_code);
	public static native short information_service_set_locale(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, String locale_code);
	@Deprecated 
	public static native short information_service_get_value_as_xml(Pointer service, Pointer domain, Pointer key, PointerByReference xml);
	public static native short information_service_get_value_as_xml(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, String domain, String key, PointerByReference xml);
	@Deprecated 
	public static native short information_service_is_developer_mode_enabled(Pointer service, IntByReference enabled);
	public static native short information_service_is_developer_mode_enabled(ImobiledeviceSdkLibrary.sdk_idevice_information_service_t service, IntBuffer enabled);
	@Deprecated 
	public static native short installation_service_new(Pointer device, Pointer service);
	public static native short installation_service_new(ImobiledeviceSdkLibrary.sdk_idevice_t device, PointerByReference service);
	public static native short installation_service_new(Pointer device, PointerByReference service);
	@Deprecated 
	public static native short installation_service_free(Pointer service);
	public static native short installation_service_free(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t service);
	@Deprecated 
	public static native short installation_service_install_application_from_archive(Pointer service, Pointer archive_filename);
	public static native short installation_service_install_application_from_archive(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t service, String archive_filename);
	@Deprecated 
	public static native short installation_service_install_application_from_archive_with_callback(Pointer service, Pointer archive_filename, ImobiledeviceSdkLibrary.sdk_idevice_installation_service_status_cb_t callback, Pointer user_data);
	public static native short installation_service_install_application_from_archive_with_callback(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t service, String archive_filename, ImobiledeviceSdkLibrary.sdk_idevice_installation_service_status_cb_t callback, Pointer user_data);
	@Deprecated 
	public static native short installation_service_uninstall_application_with_callback(Pointer service, Pointer bundle_identifier, ImobiledeviceSdkLibrary.sdk_idevice_installation_service_status_cb_t callback, Pointer user_data);
	public static native short installation_service_uninstall_application_with_callback(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t service, String bundle_identifier, ImobiledeviceSdkLibrary.sdk_idevice_installation_service_status_cb_t callback, Pointer user_data);
	@Deprecated 
	public static native short installation_service_uninstall_application(Pointer service, Pointer bundle_identifier);
	public static native short installation_service_uninstall_application(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t service, String bundle_identifier);
	@Deprecated 
	public static native short installation_service_get_application_list(Pointer service, int type, PointerByReference app_info_list, IntByReference count);
	public static native short installation_service_get_application_list(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t service, int type, ImobiledeviceSdkLibrary.sdk_idevice_app_info_t.ByReference app_info_list, IntBuffer count);
	public static native short installation_service_get_application_list(Pointer service, int type, ImobiledeviceSdkLibrary.sdk_idevice_app_info_t.ByReference app_info_list, IntByReference count);
	@Deprecated 
	public static native short installation_service_get_application_list_as_xml(Pointer installservice, int type, PointerByReference xml);
	public static native short installation_service_get_application_list_as_xml(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t installservice, int type, PointerByReference xml);
	@Deprecated 
	public static native short installation_service_application_list_free(Pointer service, ImobiledeviceSdkLibrary.sdk_idevice_app_info_t app_info_list, int count);
	public static native short installation_service_application_list_free(ImobiledeviceSdkLibrary.sdk_idevice_installation_service_t service, ImobiledeviceSdkLibrary.sdk_idevice_app_info_t app_info_list, int count);
	@Deprecated 
	public static native short syslog_service_new(Pointer device, Pointer service);
	public static native short syslog_service_new(ImobiledeviceSdkLibrary.sdk_idevice_t device, PointerByReference service);
	public static native short syslog_service_new(Pointer device, PointerByReference service);
	@Deprecated 
	public static native short syslog_service_free(Pointer service);
	public static native short syslog_service_free(ImobiledeviceSdkLibrary.sdk_idevice_syslog_service_t service);
	@Deprecated 
	public static native short syslog_service_start_capture(Pointer service, ImobiledeviceSdkLibrary.sdk_idevice_syslog_service_read_cb_t callback, Pointer user_data);
	public static native short syslog_service_start_capture(ImobiledeviceSdkLibrary.sdk_idevice_syslog_service_t service, ImobiledeviceSdkLibrary.sdk_idevice_syslog_service_read_cb_t callback, Pointer user_data);
	@Deprecated 
	public static native short syslog_service_stop_capture(Pointer service);
	public static native short syslog_service_stop_capture(ImobiledeviceSdkLibrary.sdk_idevice_syslog_service_t service);
	@Deprecated 
	public static native short debug_service_new(Pointer device, Pointer service);
	public static native short debug_service_new(ImobiledeviceSdkLibrary.sdk_idevice_t device, PointerByReference service);
	public static native short debug_service_new(Pointer device, PointerByReference service);
	@Deprecated 
	public static native short debug_service_free(Pointer service);
	public static native short debug_service_free(ImobiledeviceSdkLibrary.sdk_idevice_debug_service_t service);
	@Deprecated 
	public static native short debug_service_launch_application_by_bundle_identifier(Pointer service, Pointer bundle_identifier, PointerByReference environment, PointerByReference arguments, IntByReference pid);
	public static native short debug_service_launch_application_by_bundle_identifier(ImobiledeviceSdkLibrary.sdk_idevice_debug_service_t service, String bundle_identifier, PointerByReference environment, PointerByReference arguments, IntBuffer pid);
	@Deprecated 
	public static native short app_container_service_new(Pointer device, Pointer service);
	public static native short app_container_service_new(ImobiledeviceSdkLibrary.sdk_idevice_t device, PointerByReference service);
	public static native short app_container_service_new(Pointer device, PointerByReference service);
	@Deprecated 
	public static native short app_container_service_free(Pointer service);
	public static native short app_container_service_free(ImobiledeviceSdkLibrary.sdk_idevice_app_container_service_t service);
	@Deprecated 
	public static native short app_container_service_empty_application_cache(Pointer service, Pointer bundle_identifier);
	public static native short app_container_service_empty_application_cache(ImobiledeviceSdkLibrary.sdk_idevice_app_container_service_t service, String bundle_identifier);
	/** Pointer to unknown (opaque) type */
	public static class sdk_idevice_debug_service_t extends PointerType {
		public sdk_idevice_debug_service_t(Pointer address) {
			super(address);
		}
		public sdk_idevice_debug_service_t() {
			super();
		}
	};
	/** Pointer to unknown (opaque) type */
	public static class sdk_idevice_t extends PointerType {
		public sdk_idevice_t(Pointer address) {
			super(address);
		}
		public sdk_idevice_t() {
			super();
		}
	};
	/** Pointer to unknown (opaque) type */
	public static class sdk_idevice_app_container_service_t extends PointerType {
		public sdk_idevice_app_container_service_t(Pointer address) {
			super(address);
		}
		public sdk_idevice_app_container_service_t() {
			super();
		}
	};
	/** Pointer to unknown (opaque) type */
	public static class sdk_idevice_installation_service_t extends PointerType {
		public sdk_idevice_installation_service_t(Pointer address) {
			super(address);
		}
		public sdk_idevice_installation_service_t() {
			super();
		}
	};
	/** Pointer to unknown (opaque) type */
	public static class sdk_idevice_syslog_service_t extends PointerType {
		public sdk_idevice_syslog_service_t(Pointer address) {
			super(address);
		}
		public sdk_idevice_syslog_service_t() {
			super();
		}
	};
	/** Pointer to unknown (opaque) type */
	public static class sdk_idevice_information_service_t extends PointerType {
		public sdk_idevice_information_service_t(Pointer address) {
			super(address);
		}
		public sdk_idevice_information_service_t() {
			super();
		}
	};
}
