/**
 * 認可マスタグリッド定義
 */

let MhrShokuiNinkaGridColumns = [];

$(function() {
    MhrShokuiNinkaGridColumns = [
        Column.refer('BUSHO_ID', Messages['MhrShokuiNinkaGrid.bushoId'], 90, 'primaryKey', 'BUSHO_MEI'),
        Column.refer('SHOKUI_ID', Messages['MhrShokuiNinkaGrid.shokuiId'], 90, 'primaryKey', 'SHOKUI_MEI'),
        Column.text('KINO_NM', Messages['MhrShokuiNinkaGrid.kinoNm'], 180, 'primaryKey', null),
        Column.select('KENGEN_KB', Messages['MhrShokuiNinkaGrid.kengenKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.date('TEKIYO_BI', Messages['MhrShokuiNinkaGrid.tekiyoBi'], 90, '', Slick.Formatters.Extends.Date),
        Column.date('SHURYO_BI', Messages['MhrShokuiNinkaGrid.shuryoBi'], 90, '', Slick.Formatters.Extends.Date),
        Column.cell('UPDATE_TS', Messages['MhrShokuiNinkaGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
