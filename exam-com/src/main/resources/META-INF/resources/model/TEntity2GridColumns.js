/**
 * エンティティ２グリッド定義
 */

let TEntity2GridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity2Grid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_SN', Messages['TEntity2Grid.oyaSn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_SN', Messages['TEntity2Grid.entitySn'], 150, 'primaryKey numbering', null),
    Column.text('NULL_ENTITY2_MEI', Messages['TEntity2Grid.nullEntity2Mei'], 300, '', null),
    Column.text('ENTITY2_MEI', Messages['TEntity2Grid.entity2Mei'], 300, '', null),
    Column.check('CHECK_F', Messages['TEntity2Grid.checkF'], 30, ''),
    Column.select('RADIO_KB', Messages['TEntity2Grid.radioKb'], 30, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PULLDOWN_KB', Messages['TEntity2Grid.pulldownKb'], 30, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.longText('MEMO_TX', Messages['TEntity2Grid.memoTx'], 300, '', null),
    Column.date('HIDUKE_YMD', Messages['TEntity2Grid.hidukeYmd'], 150, '', null),
    Column.month('NENGETSU_YM', Messages['TEntity2Grid.nengetsuYm'], 105, '', null),
    Column.text('SAMPLE_Y', Messages['TEntity2Grid.sampleY'], 60, '', null),
    Column.text('SAMPLE_M', Messages['TEntity2Grid.sampleM'], 30, '', null),
    Column.dateTime('NICHIJI_DT', Messages['TEntity2Grid.nichijiDt'], 300, ''),
    Column.time('JIKOKU_HM', Messages['TEntity2Grid.jikokuHm'], 90, '', null),
    Column.text('JIKAN_TM', Messages['TEntity2Grid.jikanTm'], 90, '', null),
    Column.dec2('SURYO_QT', Messages['TEntity2Grid.suryoQt'], 135, '', null),
    Column.dec3('TANKA_AM', Messages['TEntity2Grid.tankaAm'], 165, '', null),
    Column.dec3('KINGAKU_AM', Messages['TEntity2Grid.kingakuAm'], 165, '', null),
    Column.date8('FIG_8_BI', Messages['TEntity2Grid.fig8Bi'], 120, '', null),
    Column.cell('INSERT_DT', Messages['TEntity2Grid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity2Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity2Grid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity2Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntity2Grid.deleteF'], 30, ''),
];
