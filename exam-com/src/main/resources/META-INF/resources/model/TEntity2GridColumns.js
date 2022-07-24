/**
 * エンティティ２グリッド定義
 */

let TEntity2GridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity2Grid.sosenId'], 100, 'primaryKey', 'SOSEN_MEI'),
    Column.cell('OYA_SN', Messages['TEntity2Grid.oyaSn'], 100, 'primaryKey', null),
    Column.cell('ENTITY_SN', Messages['TEntity2Grid.entitySn'], 100, 'primaryKey', null),
    Column.text('NULL_ENTITY2_MEI', Messages['TEntity2Grid.nullEntity2Mei'], 200, '', null),
    Column.text('ENTITY2_MEI', Messages['TEntity2Grid.entity2Mei'], 300, '', null),
    Column.check('CHECK_F', Messages['TEntity2Grid.checkF'], 10, ''),
    Column.select('RADIO_KB', Messages['TEntity2Grid.radioKb'], 20, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PULLDOWN_KB', Messages['TEntity2Grid.pulldownKb'], 20, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.longText('MEMO_TX', Messages['TEntity2Grid.memoTx'], 300, '', null),
    Column.date('HIDUKE_YMD', Messages['TEntity2Grid.hidukeYmd'], 100, '', null),
    Column.month('NENGETSU_YM', Messages['TEntity2Grid.nengetsuYm'], 70, '', null),
    Column.text('SAMPLE_Y', Messages['TEntity2Grid.sampleY'], 40, '', null),
    Column.text('SAMPLE_M', Messages['TEntity2Grid.sampleM'], 20, '', null),
    Column.dateTime('NICHIJI_DT', Messages['TEntity2Grid.nichijiDt'], 230, ''),
    Column.time('JIKOKU_HM', Messages['TEntity2Grid.jikokuHm'], 60, '', null),
    Column.text('JIKAN_TM', Messages['TEntity2Grid.jikanTm'], 60, '', null),
    Column.dec2('SURYO_QT', Messages['TEntity2Grid.suryoQt'], 90, '', null),
    Column.dec3('TANKA_AM', Messages['TEntity2Grid.tankaAm'], 110, '', null),
    Column.dec3('KINGAKU_AM', Messages['TEntity2Grid.kingakuAm'], 110, '', null),
    Column.text('FIG_8_BI', Messages['TEntity2Grid.fig8Bi'], 80, '', null),
    Column.cell('INSERT_DT', Messages['TEntity2Grid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity2Grid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity2Grid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity2Grid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntity2Grid.deleteF'], 10, ''),
];
